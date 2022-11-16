package pat.project.home.presentation.ui

import android.content.Context
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import pat.project.dagger.findDependencies
import pat.project.ecompatproject.feature.home.R
import pat.project.ecompatproject.feature.home.databinding.FragmentHomeBinding
import pat.project.home.presentation.di.DaggerHomeComponent

class HomeFragment : Fragment(R.layout.fragment_home){

    private val viewBinding  by viewBinding(FragmentHomeBinding::bind)

    override fun onAttach(context: Context) {
        DaggerHomeComponent.builder()
            .homeDeps(findDependencies())
            .build()
            .inject(this)

        super.onAttach(context)
    }

}