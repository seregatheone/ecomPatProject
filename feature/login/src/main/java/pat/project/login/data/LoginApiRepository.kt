package pat.project.login.data

import pat.project.login_api_interface.models.LoginRequest
import pat.project.login_api_interface.models.LoginResponse

interface LoginApiRepository {
    suspend fun getLoginResponseModel(loginRequest : LoginRequest): LoginResponse
}