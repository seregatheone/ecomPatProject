package pat.project.home.presentation.ui.home_fragment.adapters.category

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import pat.project.ecompatproject.feature.home.R
import pat.project.ecompatproject.feature.home.databinding.SelectCategoryItemBinding

class CategoryAdapter(private val parentContext : Context, private val currentActive : Int) : RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>(){
    private var allData: List<CategoryModel> = listOf(
        CategoryModel(0,false,"Phones", R.drawable.smartphone_icon),
        CategoryModel(1,false,"Computer", R.drawable.computer_icon),
        CategoryModel(2,false,"Health", R.drawable.health_icon),
        CategoryModel(3,false,"Books", R.drawable.book_icon),
        CategoryModel(4,false,"Cameras", R.drawable.camera_icon),
    )

    init {
        allData[currentActive].isActive = true
    }

    inner class CategoryViewHolder(
        private val binding: SelectCategoryItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: CategoryModel) {
            binding.iconTextView.text = item.title

            binding.categoryArea.setOnClickListener {
                setActive(item.id)
            }

            Glide.with(parentContext)
                .load(item.pictureId)
                .into(binding.imageView)

            when(item.isActive){
                true -> {
                    binding.iconTextView.setTextColor(Color.parseColor("#FF6E4E"))
                    binding.iconImageView.setBackgroundResource(R.drawable.category_shape_active)
                    binding.imageView.setColorFilter(Color.parseColor("#ffffff"))
                }
                false -> {
                    binding.iconTextView.setTextColor(Color.parseColor("#010035"))
                    binding.iconImageView.setBackgroundResource(R.drawable.category_shape)
                    binding.imageView.colorFilter = null
                }
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val itemBinding =
            SelectCategoryItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CategoryViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val currentItem = allData[position]
        holder.bind(currentItem)
    }

    override fun getItemCount(): Int = allData.size


    @SuppressLint("NotifyDataSetChanged")
    private fun setActive(id : Int){
        allData.map { it.isActive = false }
        allData[id].isActive = true
        notifyDataSetChanged()
    }

}