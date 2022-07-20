package ag.sportradar.moviedatabase.koin

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import org.koin.core.qualifier.named
import org.koin.dsl.module

object AppModule {
    val module = module {
        single(named("ioScheduler")) { Schedulers.io() }
        single(named("mainScheduler")) { AndroidSchedulers.mainThread() }
    }
}