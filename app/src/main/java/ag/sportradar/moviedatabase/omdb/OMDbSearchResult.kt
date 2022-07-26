package ag.sportradar.moviedatabase.omdb

import com.google.gson.annotations.SerializedName

data class OMDbSearchResult(
    @SerializedName("Search") val movies: List<OMDbMovie>,
    val totalResults: String
)