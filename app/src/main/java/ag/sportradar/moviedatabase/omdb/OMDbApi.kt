package ag.sportradar.moviedatabase.omdb

import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface OMDbApi {
    @GET
    fun search(
        @Query("s") name: String,
        @Query("page") page: Int,
        @Query("apikey") apiKey: String
    ): Observable<OMDbSearchResult>

    @GET
    fun getMovieDetails(
        @Query("i") imdbId: String,
        @Query("apikey") apiKey: String
    ): Observable<OMDbMovieDetails>
}

