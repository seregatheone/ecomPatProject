package pat.project.home.data

import pat.project.home_api_interface.models.ResponseModel

interface HomeApiRepository {
    suspend fun getHomeResponseModel(): ResponseModel
}