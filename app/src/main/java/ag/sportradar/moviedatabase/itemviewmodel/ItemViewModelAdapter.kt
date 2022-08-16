package ag.sportradar.moviedatabase.itemviewmodel


import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

class ItemViewModelAdapter : RecyclerView.Adapter<ItemViewModelViewHolder>() {

    var itemViewModels: List<ItemViewModel> = emptyList()

    @SuppressLint("NotifyDataSetChanged")
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewModelViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding: ViewDataBinding = DataBindingUtil.inflate(inflater, viewType, parent, false)
        return ItemViewModelViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewModelViewHolder, position: Int) {
        holder.bind(itemViewModels[position])
    }

    override fun getItemCount() = itemViewModels.size

    override fun getItemViewType(position: Int): Int {
        return itemViewModels[position].layoutId
    }
}