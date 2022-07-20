package ag.sportradar.moviedatabase.koin

import ag.sportradar.moviedatabase.omdb.OMDbApi
import ag.sportradar.moviedatabase.omdb.OMDbFakeApi
import org.koin.dsl.module

object ApiModule {
    val module = module {
        single<OMDbApi> { OMDbFakeApi() }
    }
}