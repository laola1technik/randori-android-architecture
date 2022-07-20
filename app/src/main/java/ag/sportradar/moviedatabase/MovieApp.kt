package ag.sportradar.moviedatabase

import ag.sportradar.moviedatabase.koin.ApiModule
import ag.sportradar.moviedatabase.koin.AppModule
import ag.sportradar.moviedatabase.koin.ViewModelModule
import ag.sportradar.moviedatabase.omdb.OMDbApi
import ag.sportradar.moviedatabase.omdb.OmDbFakeApi
import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.component.KoinComponent
import org.koin.core.context.startKoin
import java.util.concurrent.TimeUnit

class MovieApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MovieApp)
            modules(
                AppModule.module, ApiModule.module, ViewModelModule.module
            )
        }
    }
}