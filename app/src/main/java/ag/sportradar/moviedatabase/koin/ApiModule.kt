package ag.sportradar.moviedatabase.koin

import ag.sportradar.moviedatabase.omdb.OMDbApi
import ag.sportradar.moviedatabase.omdb.OmDbFakeApi
import org.koin.dsl.module

object ApiModule {
    val module = module {
        single<OMDbApi> { OmDbFakeApi() }
    }
}