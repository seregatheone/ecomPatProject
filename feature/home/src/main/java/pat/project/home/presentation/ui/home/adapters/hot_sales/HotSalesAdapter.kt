package pat.project.home.presentation.ui.home.adapters.hot_sales

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import pat.project.ecompatproject.feature.home.databinding.HotSalesItemBinding
import pat.project.ui_widgets.adapter_delegates.DelegateAdapter
import pat.project.ui_widgets.adapter_delegates.DelegateAdapterItem

class HotSalesAdapter (private val parentContext: Context) :
    DelegateAdapter<HotSalesModel, HotSalesAdapter.HotSalesViewHolder>(HotSalesModel::class.java) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder =
        HotSalesViewHolder(
            HotSalesItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun bindViewHolder(
        model: HotSalesModel,
        viewHolder: HotSalesAdapter.HotSalesViewHolder,
        payloads: List<DelegateAdapterItem.Payloadable>
    ) {
        viewHolder.bind(model)
    }

    inner class HotSalesViewHolder(
        private val binding: HotSalesItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: HotSalesModel) {
            binding.titleHotSales.text = item.title
            binding.descriptionHotSales.text = item.title
            when(item.is_new){
                true -> binding.newItem.visibility= View.VISIBLE
                false -> binding.newItem.visibility = View.GONE
            }

            Glide.with(parentContext)
                .load(item.picture)
                .into(binding.viewPager)
        }
    }

}