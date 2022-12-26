package pat.project.login.data

import pat.project.login_api_interface.LoginApiService
import pat.project.login_api_interface.models.LoginRequest
import pat.project.login_api_interface.models.LoginResponse
import javax.inject.Inject

class LoginApiRepositoryImpl @Inject constructor(private val apiService: LoginApiService) :
    LoginApiRepository {
    override suspend fun getLoginResponseModel(loginRequest: LoginRequest): LoginResponse =
        apiService.getLoginResponseModel(loginRequest)
}