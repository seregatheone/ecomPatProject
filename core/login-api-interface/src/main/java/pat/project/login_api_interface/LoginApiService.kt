package pat.project.login_api_interface

import pat.project.login_api_interface.models.LoginRequest
import pat.project.login_api_interface.models.LoginResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface LoginApiService {
    @POST("api/clients/login")
    suspend fun getLoginResponseModel(@Body loginRequest: LoginRequest): LoginResponse
}