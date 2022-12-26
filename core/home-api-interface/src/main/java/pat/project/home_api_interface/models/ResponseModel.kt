package pat.project.home_api_interface.models

import pat.project.home_api_interface.backmodels.Products

data class ResponseModel(
    val products: List<Products>
)