package pat.project.home.presentation.ui.home_fragment.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import pat.project.ecompatproject.feature.home.databinding.HotSalesItemBinding
import pat.project.home_api_interface.models.HomeStore

class HotSalesAdapter (private val parentContext: Context) : RecyclerView.Adapter<HotSalesAdapter.HotSalesViewHolder>() {
    private var allData: List<HomeStore> = emptyList()

    inner class HotSalesViewHolder(
        private val binding: HotSalesItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: HomeStore) {
            binding.titleHotSales.text = item.title
            binding.descriptionHotSales.text = item.title
            when(item.is_new){
                true -> binding.newItem.visibility = View.VISIBLE
                false -> binding.newItem.visibility = View.GONE
            }

            Glide.with(parentContext)
                .load(item.picture)
                .centerCrop()
                .into(binding.hotSalesImage)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HotSalesViewHolder {
        val itemBinding =
            HotSalesItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HotSalesViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: HotSalesViewHolder, position: Int) {
        val currentItem = allData[position]
        holder.bind(currentItem)
    }

    override fun getItemCount(): Int = allData.size

    @SuppressLint("NotifyDataSetChanged")
    fun setData(listOfHomeStore : List<HomeStore>){
        allData = listOfHomeStore
        notifyDataSetChanged()
    }
}