package pat.project.login.presentation.di

import dagger.Component
import dagger.Module
import pat.project.dagger.Dependencies
import pat.project.login.presentation.di.modules.LoginDataModule
import pat.project.login.presentation.navigation.LoginNavCommandProvider
import pat.project.login.presentation.ui.LoginFragment
import pat.project.login_api_interface.LoginApiService

@Component(modules = [LoginModule::class, LoginDataModule::class], dependencies = [LoginDeps::class])
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
    val loginApiService : LoginApiService
}