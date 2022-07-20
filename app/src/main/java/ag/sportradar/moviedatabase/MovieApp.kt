package ag.sportradar.moviedatabase

import ag.sportradar.moviedatabase.omdb.OMDbApi
import ag.sportradar.moviedatabase.omdb.OmDbFakeApi
import android.app.Application
import java.util.concurrent.TimeUnit

class MovieApp : Application() {

    val api: OMDbApi = OmDbFakeApi(3, TimeUnit.SECONDS)
//    val api: OMDbApi = Retrofit.Builder()
//        .baseUrl("http://www.omdbapi.com/")
//        .addConverterFactory(GsonConverterFactory.create())
//        .build()
//        .create(OMDbApi::class.java)

    override fun onCreate() {
        super.onCreate()
    }
}