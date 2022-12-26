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
import pat.project.home_api_interface.backmodels.Products

class BestSellerAdapter(private val parentContext: Context, private val navigateToProductInfo :() -> Unit) : RecyclerView.Adapter<BestSellerAdapter.BestSellerViewHolder>() {

    private var allData: List<Products> = emptyList()

    inner class BestSellerViewHolder(
        private val binding: BestSellerItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Products) {
            Log.i("startBinding","startBinding")
            binding.bestSellerLayout.setOnClickListener {
                navigateToProductInfo()
            }

            binding.priceWith.text = item.priceDiscount.toString()
            binding.priceWithout.paintFlags = binding.priceWithout.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
            binding.priceWithout.text = item.price.toString()
//            when (item.) {
//                true -> binding.favoriteIconPictureId.visibility = View.VISIBLE
//                false -> binding.favoriteIconPictureId.visibility = View.GONE
//            }
            binding.name.text = item.title
            val url = item.productPhotoUrls.random().url
            Log.i("urlkaBestSeller",url)
            Glide.with(parentContext)
                .load(url)
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
        Log.i("onBindViewHolder","onBindViewHolder")
        holder.bind(currentItem)
    }

    override fun getItemCount(): Int = allData.size

    @SuppressLint("NotifyDataSetChanged")
    fun setData(listOfBestSellers : List<Products>){
        allData = listOfBestSellers
        notifyDataSetChanged()
    }
}