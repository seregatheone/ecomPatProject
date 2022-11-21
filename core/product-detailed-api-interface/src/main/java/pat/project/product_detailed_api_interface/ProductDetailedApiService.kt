package pat.project.product_detailed_api_interface

import pat.project.product_detailed_api_interface.models.ProductDetailedModel
import retrofit2.http.GET

interface ProductDetailedApiService {
    @GET("v3/654bd15e-b121-49ba-a588-960956b15175")
    suspend fun getHomeResponseModel(): ProductDetailedModel
}