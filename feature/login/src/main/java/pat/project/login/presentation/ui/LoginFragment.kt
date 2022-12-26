package pat.project.login.presentation.ui

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.Lazy
import pat.project.dagger.findDependencies
import pat.project.ecompatproject.feature.login.R
import pat.project.ecompatproject.feature.login.databinding.FragmentLoginBinding
import pat.project.login.presentation.navigation.LoginNavCommandProvider
import javax.inject.Inject
import pat.project.login.presentation.di.DaggerLoginComponent
import pat.project.navigation.navigate
import pat.project.network_utils.Status


class LoginFragment : Fragment(R.layout.fragment_login) {
    private val viewBinding by viewBinding(FragmentLoginBinding::bind)

    @Inject
    lateinit var signUpNavCommandProvider: LoginNavCommandProvider

    @Inject
    lateinit var viewModelFactory: Lazy<LoginViewModel.Companion.LoginFragmentViewModelFactory>
    private val viewModel: LoginViewModel by viewModels { viewModelFactory.get() }

    override fun onAttach(context: Context) {
        DaggerLoginComponent.builder()
            .loginDeps(findDependencies())
            .build()
            .inject(this)
        super.onAttach(context)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewBinding.loginButton.setOnClickListener {
            val login = viewBinding.loginEdittext.text.toString()
            val password = viewBinding.passwordEdittext.text.toString()
            lifecycleScope.launchWhenStarted {
                viewModel.getLoginResponseModel(login = login, password = password)
                    .collect { resource ->
                        when (resource.status) {
                            Status.SUCCESS -> {
                                Toast.makeText(
                                    requireContext(),
                                    "Your token is -> ${resource.data!!.accessToken}",
                                    Toast.LENGTH_LONG
                                ).show()
                                navigate(signUpNavCommandProvider.toHomeScreen)
                            }
                            Status.ERROR -> {
                                Log.i("wrongwrong",resource.message.toString())
                            }
                            Status.LOADING -> {
                                Toast.makeText(requireContext(),"Запрос отправлен",Toast.LENGTH_SHORT).show()
                            }
                        }
                    }
            }
        }
        super.onViewCreated(view, savedInstanceState)
    }
}