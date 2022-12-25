package pat.project.signup.presentation.di

import dagger.Component
import dagger.Module
import pat.project.dagger.Dependencies
import pat.project.signup.presentation.navigation.SignUpNavCommandProvider
import pat.project.signup.presentation.ui.SignUpFragment

@Component(modules = [SignUpModule::class], dependencies = [SignUpDeps::class])
interface SignUpComponent {
    fun inject(signUpFragment: SignUpFragment)
    @Component.Builder
    interface Builder{
        fun signUpDeps(deps: SignUpDeps): Builder
        fun build(): SignUpComponent
    }
}

@Module
internal class SignUpModule


interface SignUpDeps : Dependencies{
    val signUpNavCommandProvider : SignUpNavCommandProvider
}