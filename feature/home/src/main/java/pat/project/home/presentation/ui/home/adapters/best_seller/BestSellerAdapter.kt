package pat.project.home.presentation.ui.home.adapters.best_seller

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import pat.project.ecompatproject.feature.home.databinding.BestSellerItemBinding
import pat.project.ui_widgets.adapter_delegates.DelegateAdapter
import pat.project.ui_widgets.adapter_delegates.DelegateAdapterItem

class BestSellerAdapter(private val parentContext: Context) :
    DelegateAdapter<BestSellerModel, BestSellerAdapter.BestSellerViewHolder>(BestSellerModel::class.java) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder =
        BestSellerViewHolder(
            BestSellerItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun bindViewHolder(
        model: BestSellerModel,
        viewHolder: BestSellerViewHolder,
        payloads: List<DelegateAdapterItem.Payloadable>
    ) {
        viewHolder.bind(model)
    }

    inner class BestSellerViewHolder(
        private val binding: BestSellerItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: BestSellerModel) {
            binding.priceWith.text = item.discount_price.toString()
            binding.priceWithout.text = item.price_without_discount.toString()
            when (item.is_favorites) {
                true -> binding.favoriteIconPic.visibility = View.VISIBLE
                false -> binding.favoriteIconPic.visibility = View.GONE
            }
            binding.name.text = item.title

            Glide.with(parentContext)
                .load(item.picture)
                .into(binding.bestSellerPicture)
        }
    }
}