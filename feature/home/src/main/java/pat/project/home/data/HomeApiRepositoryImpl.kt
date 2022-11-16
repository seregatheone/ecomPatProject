package pat.project.home.data

import pat.project.home_api_interface.HomeApiService
import javax.inject.Inject

class HomeApiRepositoryImpl @Inject constructor(private val apiService: HomeApiService) :
    HomeApiRepository {
    override suspend fun getHomeResponseModel() = apiService.getHomeResponseModel()
}