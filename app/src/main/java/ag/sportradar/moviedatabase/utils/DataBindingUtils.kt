package ag.sportradar.moviedatabase.utils

import androidx.appcompat.widget.SearchView
import androidx.databinding.BindingAdapter

object DataBindingUtils {

    @JvmStatic
    @BindingAdapter("queryTextListener")
    fun setOnQueryTextListener(
        searchView: SearchView,
        onQueryTextListener: SearchView.OnQueryTextListener
    ) {
        searchView.setOnQueryTextListener(onQueryTextListener)

    }

    //TODO: binding method to set content in recyclerview
}