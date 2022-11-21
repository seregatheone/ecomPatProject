package pat.project.product_detailed_api

import pat.project.ecompatproject.core.product_detailed_api.BuildConfig
import pat.project.product_detailed_api_interface.ProductDetailedApiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ProductDetailedRetrofitBuilder {
    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BuildConfig.API_MOCK)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun homeApiService(): ProductDetailedApiService = getRetrofit().create(ProductDetailedApiService::class.java)
}
