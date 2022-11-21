package pat.project.cart_api_interface

import pat.project.cart_api_interface.models.CartModel
import retrofit2.http.GET

interface CartApiService {
    @GET("v3/654bd15e-b121-49ba-a588-960956b15175")
    suspend fun getCartResponseModel(): CartModel
}