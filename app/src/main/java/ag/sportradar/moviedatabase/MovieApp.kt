package ag.sportradar.moviedatabase

import android.app.Application

class MovieApp : Application() {

    val api: OMDbApi = OmDbFakeApi()
//    val api: OMDbApi = Retrofit.Builder()
//        .addConverterFactory(GsonConverterFactory.create())
//        .baseUrl("http://www.omdbapi.com/")
//        .build()
//        .create(OMDbApi::class.java)

    override fun onCreate() {
        super.onCreate()
    }
}