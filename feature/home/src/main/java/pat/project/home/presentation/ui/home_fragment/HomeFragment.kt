package pat.project.home.presentation.ui.home_fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.Lazy
import pat.project.dagger.findDependencies
import pat.project.ecompatproject.feature.home.R
import pat.project.ecompatproject.feature.home.databinding.FragmentHomeBinding
import pat.project.home.presentation.di.DaggerHomeComponent
import pat.project.home.presentation.ui.bottom_sheet_fragment.BottomSheetFragment
import pat.project.home.presentation.ui.home_fragment.adapters.BestSellerAdapter
import pat.project.home.presentation.ui.home_fragment.adapters.HotSalesAdapter
import pat.project.home.presentation.ui.home_fragment.adapters.category.CategoryAdapter
import pat.project.network_utils.Status
import javax.inject.Inject

class HomeFragment : Fragment(R.layout.fragment_home){

    private val viewBinding  by viewBinding(FragmentHomeBinding::bind)

    private var adapterCategory : CategoryAdapter? = null
    private var adapterHotSales : HotSalesAdapter? = null
    private var adapterBestSeller : BestSellerAdapter? = null

    @Inject
    lateinit var viewModelFactory : Lazy<HomeFragmentViewModel.Companion.HomeFragmentViewModelFactory>
    private val viewModel : HomeFragmentViewModel by viewModels{viewModelFactory.get()}

    override fun onAttach(context: Context) {
        DaggerHomeComponent.builder()
            .homeDeps(findDependencies())
            .build()
            .inject(this)

        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        adapterCategory = CategoryAdapter(requireContext(),viewModel.currentCategory.value)
        adapterHotSales = HotSalesAdapter(requireContext())
        adapterBestSeller = BestSellerAdapter(requireContext())
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewBinding.locationFilterLayout.funnel.setOnClickListener{
            BottomSheetFragment().show(childFragmentManager,"BottomSheetFragment")
        }


        with(viewBinding.selectCategoryLayout.recyclerView){
            adapter = adapterCategory
            layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
        }
        with(viewBinding.bestSellerLayout.bestSellerRecyclerView){
            adapter = adapterBestSeller
            layoutManager = GridLayoutManager(requireContext(),2)
        }
        with(viewBinding.hotSalesLayout.hotSalesRecView){
            PagerSnapHelper().attachToRecyclerView(this)
            adapter = adapterHotSales
            layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
        }

        lifecycleScope.launchWhenStarted {
            viewModel.getHomeResponseModel().collect{ resource ->
                when(resource.status){
                    Status.SUCCESS -> {
                        adapterBestSeller!!.setData(resource.data!!.best_seller)
                        adapterHotSales!!.setData(resource.data!!.home_store)
                    }
                    Status.ERROR -> {
                    }
                    Status.LOADING -> {
                    }
                }
            }
        }
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroy() {
        adapterCategory = null
        adapterHotSales = null
        adapterBestSeller = null
        super.onDestroy()
    }
}