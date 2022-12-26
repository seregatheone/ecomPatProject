package pat.project.login_api

import pat.project.ecompatproject.core.login_api.BuildConfig
import pat.project.login_api_interface.LoginApiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object LoginRetrofitBuilder {
    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BuildConfig.API_MOCK)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun loginApiService(): LoginApiService = getRetrofit().create(LoginApiService::class.java)
}
