package pat.project.login.presentation.di

import dagger.Component
import dagger.Module
import pat.project.dagger.Dependencies
import pat.project.login.presentation.navigation.LoginNavCommandProvider
import pat.project.login.presentation.ui.LoginFragment

@Component(modules = [LoginModule::class], dependencies = [LoginDeps::class])
interface LoginComponent {
    fun inject(loginFragment: LoginFragment)
    @Component.Builder
    interface Builder{
        fun loginDeps(deps: LoginDeps): Builder
        fun build(): LoginComponent
    }
}

@Module
internal class LoginModule


interface LoginDeps : Dependencies{
    val loginNavCommandProvider : LoginNavCommandProvider
}