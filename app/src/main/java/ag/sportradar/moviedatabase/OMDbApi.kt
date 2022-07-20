package ag.sportradar.moviedatabase

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
}

class OmDbFakeApi : OMDbApi {

    private val result = OMDbSearchResult(
        listOf(
            OMDbMovie(
                "Batman Begins",
                "2005",
                "tt0372784",
                "movie",
                "https://m.media-amazon.com/images/M/MV5BOTY4YjI2N2MtYmFlMC00ZjcyLTg3YjEtMDQyM2ZjYzQ5YWFkXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_SX300.jpg"
            ),
            OMDbMovie(
                "Batman v Superman: Dawn of Justice",
                "2016",
                "tt2975590",
                "movie",
                "https://m.media-amazon.com/images/M/MV5BYThjYzcyYzItNTVjNy00NDk0LTgwMWQtYjMwNmNlNWJhMzMyXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_SX300.jpg"
            ),
            OMDbMovie(
                "The Batman",
                "2022",
                "tt1877830",
                "movie",
                "https://m.media-amazon.com/images/M/MV5BMDdmMTBiNTYtMDIzNi00NGVlLWIzMDYtZTk3MTQ3NGQxZGEwXkEyXkFqcGdeQXVyMzMwOTU5MDk@._V1_SX300.jpg"
            ),
            OMDbMovie(
                "Batman",
                "1989",
                "tt0096895",
                "movie",
                "https://m.media-amazon.com/images/M/MV5BZTM2NmZlOTEtYTI5NS00N2JjLWJkNzItMmZkNDBlYmQzNDA2XkEyXkFqcGdeQXVyMTAxODYyODI@._V1_SX300.jpg"
            )
        ), "4"
    )

    override fun search(name: String, page: Int, apiKey: String): Observable<OMDbSearchResult> {
        return Observable.just(result)
    }
}