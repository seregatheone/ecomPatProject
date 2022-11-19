package pat.project.home.presentation.ui.home.adapters.best_seller

import pat.project.ui_widgets.adapter_delegates.DelegateAdapterItem

data class BestSellerModel(
    val discount_price: Int,
    val is_favorites: Boolean,
    val picture: String,
    val price_without_discount: Int,
    val title: String
) : DelegateAdapterItem {
    override fun id(): Any = BestSellerModel::class.toString()
    override fun content(): Any = BestSellerContent(
        title, price_without_discount,
        discount_price,
        picture,
        is_favorites
    )

    data class BestSellerContent(
        val title: String,
        val price_without_discount: Int,
        val discount_price: Int,
        val picture: String,
        val is_favorites: Boolean,
    )
}