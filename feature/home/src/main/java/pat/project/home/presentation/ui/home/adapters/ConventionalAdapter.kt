//package pat.project.home.presentation.ui.home.adapters
//
//import android.annotation.SuppressLint
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import pat.project.ecompatproject.feature.home.R
//import pat.project.home.presentation.ui.home.adapters.category.CategoryAdapter
//
//class ConventionalAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
//
//    private var items = emptyList<ListItem>()
//
//    sealed class ListItem {
//
//        companion object {
//            const val CATEGORY_ITEM = 0
//            const val HOT_SALES_ITEM = 1
//            const val BEST_SELLER_ITEM = 2
//        }
//
//        abstract val itemViewType: Int
//
//        data class CategoryItem(override val itemViewType: Int = CATEGORY_ITEM) : ListItem()
//        data class HotSalesItem(override val itemViewType: Int = HOT_SALES_ITEM) : ListItem()
//        data class BestSellerItem(override val itemViewType: Int = BEST_SELLER_ITEM) : ListItem()
//    }
//
//    @SuppressLint("NotifyDataSetChanged")
//    fun createListItems(items: List<Any>) {
//        //some logic here
//        this.items = items as List<ListItem>
//        notifyDataSetChanged()
//    }
//
//    override fun getItemViewType(position: Int): Int = items[position].itemViewType
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
//        return when(viewType) {
//            ListItem.CATEGORY_ITEM -> {
//                CategoryViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.category_layout, parent, false))
//            }
//
//            ListItem.HOT_SALES_ITEM -> {
//                HotSalesViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.hot_sales_layout, parent, false))
//            }
//
//            ListItem.BEST_SELLER_ITEM -> {
//                BestSellerViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.best_seller_layout, parent, false))
//            }
//            else -> {
//                throw IllegalStateException("Item not supported")
//            }
//        }
//    }
//
//    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
//        when(getItemViewType(position)) {
//            ListItem.CATEGORY_ITEM -> (holder as CategoryViewHolder).bind()
//            ListItem.HOT_SALES_ITEM -> (holder as HotSalesViewHolder).bind()
//            ListItem.BEST_SELLER_ITEM -> (holder as BestSellerViewHolder).bind()
//        }
//    }
//
//    override fun getItemCount(): Int = items.size
//
//    inner class CategoryViewHolder(private val itemView: View) : RecyclerView.ViewHolder(itemView) {
//        fun bind() {
//        }
//    }
//
//    inner class HotSalesViewHolder(private val itemView: View) : RecyclerView.ViewHolder(itemView) {
//        fun bind() {
//        }
//    }
//
//    inner class BestSellerViewHolder(private val itemView: View) : RecyclerView.ViewHolder(itemView) {
//        fun bind() {
//        }
//    }
//}