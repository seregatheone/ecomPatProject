package pat.project.login.presentation.ui

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import pat.project.dagger.findDependencies
import pat.project.ecompatproject.feature.login.R
import pat.project.ecompatproject.feature.login.databinding.FragmentLoginBinding
import pat.project.login.presentation.navigation.LoginNavCommandProvider
import pat.project.navigation.navigate
import javax.inject.Inject
import pat.project.login.presentation.di.DaggerLoginComponent


class LoginFragment : Fragment(R.layout.fragment_login){
    private val viewBinding  by viewBinding(FragmentLoginBinding::bind)

    @Inject
    lateinit var signUpNavCommandProvider : LoginNavCommandProvider

    override fun onAttach(context: Context) {
        DaggerLoginComponent.builder()
            .loginDeps(findDependencies())
            .build()
            .inject(this)
        super.onAttach(context)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewBinding.toHome.setOnClickListener{
            navigate(signUpNavCommandProvider.toHomeScreen)
        }
        super.onViewCreated(view, savedInstanceState)
    }
}