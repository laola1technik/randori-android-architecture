package ag.sportradar.moviedatabase.koin

import ag.sportradar.moviedatabase.omdb.OmDbFakeApi
import io.reactivex.android.schedulers.AndroidSchedulers
import org.koin.core.qualifier.named
import org.koin.dsl.module

object ApiModule {
    val module = module {
        single { OmDbFakeApi() }
    }
}