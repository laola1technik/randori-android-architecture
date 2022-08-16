package ag.sportradar.moviedatabase.itemviewmodel

import ag.sportradar.moviedatabase.BR
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

class ItemViewModelViewHolder(val binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(viewModel: ItemViewModel) {
        binding.setVariable(BR.vm, viewModel)
        binding.executePendingBindings()
    }
}