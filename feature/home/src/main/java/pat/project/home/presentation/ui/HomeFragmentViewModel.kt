package pat.project.home.presentation.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.*
import pat.project.home.data.HomeApiRepository
import pat.project.network_utils.Resource
import javax.inject.Inject
import javax.inject.Provider

class HomeFragmentViewModel(private val homeApiRepository: HomeApiRepository): ViewModel() {

    val currentCategory = MutableStateFlow(0)

    fun getHomeResponseModel()= flow {
        try {
            emit(Resource.success(data = homeApiRepository.getHomeResponseModel()))
        } catch (exception: Exception) {
            emit(Resource.error(data = null, message = exception.message ?: "Error Resource loading!"))
        }
    }.stateIn(
        viewModelScope,
        SharingStarted.Lazily,
        Resource.loading(data = null)
    )

    companion object{
        @Suppress("UNCHECKED_CAST")
        class HomeFragmentViewModelFactory @Inject constructor(
            private val homeApiRepository: Provider<HomeApiRepository>
        ) : ViewModelProvider.Factory {
            override fun <T : ViewModel> create(modelClass: Class<T>): T {
                require(modelClass == HomeFragmentViewModel::class.java)
                return HomeFragmentViewModel(homeApiRepository.get()) as T
            }
        }
    }
}