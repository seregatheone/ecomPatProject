package pat.project.login.presentation.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.stateIn
import pat.project.login.data.LoginApiRepository
import pat.project.login_api_interface.models.LoginRequest
import pat.project.network_utils.Resource
import javax.inject.Inject
import javax.inject.Provider

class LoginViewModel(private val loginApiRepository: LoginApiRepository) : ViewModel() {
    fun getLoginResponseModel(login: String, password: String) = flow {
        try {
            emit(
                Resource.success(
                    data = loginApiRepository.getLoginResponseModel(
                        LoginRequest(
                            login,
                            password
                        )
                    )
                )
            )
        } catch (exception: Exception) {
            emit(
                Resource.error(
                    data = null,
                    message = exception.message ?: "Error Resource loading!"
                )
            )
        }
    }.stateIn(
        viewModelScope,
        SharingStarted.Lazily,
        Resource.loading(data = null)
    )

    companion object {
        @Suppress("UNCHECKED_CAST")
        class LoginFragmentViewModelFactory @Inject constructor(
            private val loginApiRepository: Provider<LoginApiRepository>
        ) : ViewModelProvider.Factory {
            override fun <T : ViewModel> create(modelClass: Class<T>): T {
                require(modelClass == LoginViewModel::class.java)
                return LoginViewModel(loginApiRepository.get()) as T
            }
        }
    }
}
