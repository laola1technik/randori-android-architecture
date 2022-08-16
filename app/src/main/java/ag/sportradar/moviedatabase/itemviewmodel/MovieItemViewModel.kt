package ag.sportradar.moviedatabase.itemviewmodel

import ag.sportradar.moviedatabase.R
import ag.sportradar.moviedatabase.omdb.OMDbMovie
import androidx.databinding.ObservableField

class MovieItemViewModel(movie: OMDbMovie) : ItemViewModel(R.layout.item_movie) {

    val text = ObservableField(movie.title)

}