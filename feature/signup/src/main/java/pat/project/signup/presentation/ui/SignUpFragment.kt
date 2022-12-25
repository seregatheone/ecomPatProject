package pat.project.signup.presentation.ui

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import pat.project.dagger.findDependencies
import pat.project.ecompatproject.feature.signup.R
import pat.project.ecompatproject.feature.signup.databinding.FragmentSignUpBinding
import pat.project.navigation.navigate
import pat.project.signup.presentation.navigation.SignUpNavCommandProvider
import javax.inject.Inject
import pat.project.signup.presentation.di.DaggerSignUpComponent

class SignUpFragment :Fragment(R.layout.fragment_sign_up){
    private val viewBinding  by viewBinding(FragmentSignUpBinding::bind)

    @Inject
    lateinit var signUpNavCommandProvider : SignUpNavCommandProvider

    override fun onAttach(context: Context) {
        DaggerSignUpComponent.builder()
            .signUpDeps(findDependencies())
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