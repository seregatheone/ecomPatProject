package pat.project.home.presentation.ui.home_fragment.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Paint
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import pat.project.ecompatproject.feature.home.databinding.BestSellerItemBinding
import pat.project.home_api_interface.models.BestSeller

class BestSellerAdapter(private val parentContext: Context) : RecyclerView.Adapter<BestSellerAdapter.BestSellerViewHolder>() {

    private var allData: List<BestSeller> = emptyList()

    inner class BestSellerViewHolder(
        private val binding: BestSellerItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: BestSeller) {
            binding.priceWith.text = item.discount_price.toString()
            binding.priceWithout.paintFlags = binding.priceWithout.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
            binding.priceWithout.text = item.price_without_discount.toString()
            Log.i("is_favorites",item.is_favorites.toString())
            when (item.is_favorites) {
                true -> binding.favoriteIconPictureId.visibility = View.VISIBLE
                false -> binding.favoriteIconPictureId.visibility = View.GONE
            }
            binding.name.text = item.title

            Glide.with(parentContext)
                .load(item.picture)
                .into(binding.bestSellerPicture)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BestSellerViewHolder {
        val itemBinding =
            BestSellerItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BestSellerViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: BestSellerViewHolder, position: Int) {
        val currentItem = allData[position]
        holder.bind(currentItem)
    }

    override fun getItemCount(): Int = allData.size

    @SuppressLint("NotifyDataSetChanged")
    fun setData(listOfBestSellers : List<BestSeller>){
        allData = listOfBestSellers
        notifyDataSetChanged()
    }
}