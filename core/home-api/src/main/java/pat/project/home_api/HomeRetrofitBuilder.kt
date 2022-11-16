package pat.project.home_api

import pat.project.ecompatproject.core.home_api.BuildConfig
import pat.project.home_api_interface.HomeApiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object HomeRetrofitBuilder {
    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BuildConfig.API_MOCK)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun homeApiService(): HomeApiService = getRetrofit().create(HomeApiService::class.java)
}
