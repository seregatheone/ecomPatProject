package pat.project.auth.presentation.ui

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import pat.project.auth.presentation.di.DaggerAuthComponent
import pat.project.auth.presentation.navigation.AuthNavCommandProvider
import pat.project.dagger.findDependencies
import pat.project.ecompatproject.feature.auth.R
import pat.project.ecompatproject.feature.auth.databinding.FragmentAuthBinding
import javax.inject.Inject


class AuthFragment : Fragment(R.layout.fragment_auth) {

    private val viewBinding  by viewBinding(FragmentAuthBinding::bind)

    @Inject
    lateinit var authNavCommandProvider: AuthNavCommandProvider

    override fun onAttach(context: Context) {
        DaggerAuthComponent.builder()
            .cartDeps(findDependencies())
            .build()
            .inject(this)
        super.onAttach(context)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)
    }
}