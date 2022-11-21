package pat.project.cart_api

import pat.project.cart_api_interface.CartApiService
import pat.project.ecompatproject.core.cart_api.BuildConfig
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object CartRetrofitBuilder {
    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BuildConfig.API_MOCK)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun homeApiService(): CartApiService = getRetrofit().create(CartApiService::class.java)
}
