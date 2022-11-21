package pat.project.cart_api_interface.models

data class CartModel(
    val basket: List<Basket>,
    val delivery: String,
    val id: String,
    val total: Int
)