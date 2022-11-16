package pat.project.home_api_interface

import pat.project.home_api_interface.models.ResponseModel
import retrofit2.http.GET

interface HomeApiService {
    @GET("v3/654bd15e-b121-49ba-a588-960956b15175")
    suspend fun getResponseModel(): ResponseModel
}