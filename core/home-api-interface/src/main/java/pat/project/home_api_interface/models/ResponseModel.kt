package pat.project.home_api_interface.models

data class ResponseModel(
    val best_seller: List<BestSeller>,
    val home_store: List<HomeStore>
)