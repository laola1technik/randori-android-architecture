package ag.sportradar.moviedatabase.utils

import ag.sportradar.moviedatabase.itemviewmodel.ItemViewModel
import ag.sportradar.moviedatabase.itemviewmodel.ItemViewModelAdapter
import androidx.appcompat.widget.SearchView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView

object DataBindingUtils {

    @JvmStatic
    @BindingAdapter("queryTextListener")
    fun setOnQueryTextListener(
        searchView: SearchView,
        onQueryTextListener: SearchView.OnQueryTextListener
    ) {
        searchView.setOnQueryTextListener(onQueryTextListener)

    }

    @JvmStatic
    @BindingAdapter("items")
    fun setItems(recyclerView: RecyclerView, items: List<ItemViewModel>) {
        (recyclerView.adapter as? ItemViewModelAdapter)?.let { it.itemViewModels = items }
            ?: run {
                recyclerView.adapter = ItemViewModelAdapter().apply { itemViewModels = items }
            }

    }
}