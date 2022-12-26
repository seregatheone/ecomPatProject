package pat.project.home_api_interface.backmodels

data class Products(
    val productId: Int,
    val description: String,
    val productType: String,
    val price: Int,
    val priceDiscount: Int,
    val pictureMainUrl: String,
    val title: String,
    val subTitle: String,
    val productPhotoUrls : List<Pictures>
)