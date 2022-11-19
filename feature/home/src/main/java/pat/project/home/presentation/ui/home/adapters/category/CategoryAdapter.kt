package pat.project.home.presentation.ui.home.adapters.category

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import pat.project.ecompatproject.feature.home.databinding.SelectCategoryItemBinding
import pat.project.ui_widgets.adapter_delegates.DelegateAdapter
import pat.project.ui_widgets.adapter_delegates.DelegateAdapterItem

class CategoryAdapter : DelegateAdapter<CategoryModel, CategoryAdapter.CategoryViewHolder>(CategoryModel::class.java) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder =
        CategoryViewHolder(
            SelectCategoryItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun bindViewHolder(
        model: CategoryModel,
        viewHolder: CategoryViewHolder,
        payloads: List<DelegateAdapterItem.Payloadable>
    ) {
        viewHolder.bind(model)
    }

    inner class CategoryViewHolder(
        private val binding: SelectCategoryItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: CategoryModel) {
            binding.iconTextView.text = item.type
        }
    }

}