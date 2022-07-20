package ag.sportradar.moviedatabase

import android.app.Application

class MovieApp : Application() {

    val api: OMDbApi = OmDbFakeApi()

    override fun onCreate() {
        super.onCreate()
    }
}