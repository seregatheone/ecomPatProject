package pat.project.home_api_interface

import pat.project.home_api_interface.models.ResponseModel
import retrofit2.http.GET

interface HomeApiService {
    @GET("api/content/products")
    suspend fun getHomeResponseModel(): ResponseModel
}