package pat.project.login_api_interface.models

data class LoginRequest(
    val login: String,
    val password: String
)