package pat.project.home.presentation.ui.home.adapters.hot_sales

import pat.project.home.presentation.ui.home.adapters.best_seller.BestSellerModel
import pat.project.ui_widgets.adapter_delegates.DelegateAdapterItem

data class HotSalesModel(
    val id: Int,
    val is_buy: Boolean,
    val is_new: Boolean,
    val picture: String,
    val subtitle: String,
    val title: String
) : DelegateAdapterItem {
    override fun id(): Any = BestSellerModel::class.toString()
    override fun content(): Any = HotSalesContent(title,subtitle,is_new,picture)

    data class HotSalesContent(
        val title: String,
        val subtitle: String,
        val is_new: Boolean,
        val picture: String,
    )
}