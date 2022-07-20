package ag.sportradar.moviedatabase

import ag.sportradar.moviedatabase.koin.ApiModule
import ag.sportradar.moviedatabase.koin.AppModule
import ag.sportradar.moviedatabase.koin.ViewModelModule
import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

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