package ag.sportradar.moviedatabase.presentation

import ag.sportradar.moviedatabase.omdb.OMDbApi
import ag.sportradar.moviedatabase.omdb.OMDbSearchResult
import androidx.appcompat.widget.SearchView
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.reactivex.Scheduler
import io.reactivex.disposables.CompositeDisposable

class SearchMoviesViewModel(
    private val api: OMDbApi,
    private val ioScheduler: Scheduler,
    private val mainScheduler: Scheduler
) : ViewModel() {

    private val disposables = CompositeDisposable()
    private val viewState = MutableLiveData<SearchResultViewState>(SearchResultViewState.Loading)

    val onQueryTextListener = object : SearchView.OnQueryTextListener {
        override fun onQueryTextSubmit(query: String?): Boolean {
            search(query ?: "")
            return true
        }

        override fun onQueryTextChange(newText: String?) = false

    }

    fun search(name: String) {
        api.search(name, 1, "")
            .subscribeOn(ioScheduler)
            .observeOn(mainScheduler)
            .subscribe({ result ->
                viewState.value = SearchResultViewState.Loaded(result)
            }, { throwable ->
                viewState.value =
                    SearchResultViewState.Error(throwable.message ?: "no error message")
            }).let { disposables.add(it) }
    }

    override fun onCleared() {
        super.onCleared()
        disposables.clear()
    }

}

sealed interface SearchResultViewState {
    object Loading : SearchResultViewState
    data class Error(val message: String) : SearchResultViewState
    data class Loaded(val result: OMDbSearchResult) : SearchResultViewState
}
