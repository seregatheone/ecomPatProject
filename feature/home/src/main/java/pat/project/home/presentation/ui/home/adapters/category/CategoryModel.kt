package pat.project.home.presentation.ui.home.adapters.category

import pat.project.ui_widgets.adapter_delegates.DelegateAdapterItem

data class CategoryModel(
    val isActive: Boolean,
    val type: String,
    val pictureId: Int = 0
) : DelegateAdapterItem {
    override fun id(): Any = CategoryModel::class.toString()

    override fun content(): Any = CategoryContent(
        isActive,
        type,
        pictureId,
    )

    data class CategoryContent(
        val isActive: Boolean,
        val type: String,
        val pictureId: Int = 0
    )
}