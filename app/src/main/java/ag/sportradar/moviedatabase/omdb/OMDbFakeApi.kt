package ag.sportradar.moviedatabase.omdb

import io.reactivex.Observable
import java.util.concurrent.TimeUnit

class OMDbFakeApi(
    private val delay: Long = 0L,
    private val timeUnit: TimeUnit = TimeUnit.MILLISECONDS
) : OMDbApi {
    override fun search(name: String, page: Int, apiKey: String): Observable<OMDbSearchResult> {
        return if (name.isNotEmpty() && name.startsWith("B"))
            Observable.just(
                OMDbSearchResult(
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
            ).delay(delay, timeUnit)
        else
            Observable.just(OMDbSearchResult(emptyList(), "0"))
    }

    override fun details(imdbId: String, apiKey: String): Observable<OMDbMovieDetails> {
        return Observable.just(
            OMDbMovieDetails(
                title = "Batman Begins",
                year = "2005",
                rated = "PG-13",
                released = "15 Jun 2005",
                runtime = "140 min",
                genre = "Action, Crime, Drama",
                director = "Christopher Nolan",
                writer = "Bob Kane, David S. Goyer, Christopher Nolan",
                actors = "Christian Bale, Michael Caine, Ken Watanabe",
                plot = "After training with his mentor, Batman begins his fight to free crime-ridden Gotham City from corruption.",
                language = "English, Mandarin",
                country = "United States, United Kingdom",
                awards = "Nominated for 1 Oscar. 13 wins & 79 nominations total",
                poster = "https://m.media-amazon.com/images/M/MV5BOTY4YjI2N2MtYmFlMC00ZjcyLTg3YjEtMDQyM2ZjYzQ5YWFkXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_SX300.jpg",
                ratings = listOf(
                    Rating("Internet Movie Database", "8.2/10"),
                    Rating("Rotten Tomatoes", "84%"),
                    Rating("Metacritic", "70/100")
                ),
                metascore = "70",
                imdbRating = "8.2",
                imdbVotes = "1,439,078",
                imdbID = "tt0372784",
                Type = "movie",
                dvd = "18 Oct 2005",
                boxOffice = "$206,863,479",
                production = "N/A",
                website = "N/A",
                response = "True"
            )
        ).delay(delay, timeUnit)
    }
}