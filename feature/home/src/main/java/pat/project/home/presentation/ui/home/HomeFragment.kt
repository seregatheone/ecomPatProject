package pat.project.home.presentation.ui.home

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.Lazy
import pat.project.dagger.findDependencies
import pat.project.ecompatproject.feature.home.R
import pat.project.ecompatproject.feature.home.databinding.FragmentHomeBinding
import pat.project.home.presentation.di.DaggerHomeComponent
import pat.project.home.presentation.ui.home.adapters.best_seller.BestSellerAdapter
import pat.project.home.presentation.ui.home.adapters.category.CategoryAdapter
import pat.project.home.presentation.ui.home.adapters.hot_sales.HotSalesAdapter
import pat.project.network_utils.Status
import pat.project.ui_widgets.adapter_delegates.CompositeAdapter
import pat.project.ui_widgets.adapter_delegates.DelegateAdapterItem
import javax.inject.Inject

class HomeFragment : Fragment(R.layout.fragment_home){

    private val viewBinding  by viewBinding(FragmentHomeBinding::bind)

    private val compositeAdapter by lazy {
        CompositeAdapter.Builder()
            .add(CategoryAdapter())
            .add(HotSalesAdapter(requireContext()))
            .add(BestSellerAdapter(requireContext()))
            .build()
    }

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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewBinding.homeRecView.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)
        viewBinding.homeRecView.adapter = compositeAdapter

        val list = listOf<DelegateAdapterItem>()

        compositeAdapter.submitList(list)

        lifecycleScope.launchWhenStarted {
            viewModel.getHomeResponseModel().collect{ resource ->
                when(resource.status){
                    Status.SUCCESS -> {
                        Log.i("resourceSUCCESS",resource.data.toString())
                    }
                    Status.ERROR -> {
                        Log.i("resourceERROR",resource.data.toString())
                    }
                    Status.LOADING -> {
                        Log.i("resourceLOADING",resource.data.toString())
                    }
                }
            }
        }
        super.onViewCreated(view, savedInstanceState)
    }
}