package pat.project.auth.presentation.di

import dagger.Component
import dagger.Module
import pat.project.auth.presentation.navigation.AuthNavCommandProvider
import pat.project.auth.presentation.ui.AuthFragment
import pat.project.dagger.Dependencies


@Component(modules = [AuthModule::class], dependencies = [AuthDeps::class])
interface AuthComponent {
    fun inject(authFragment: AuthFragment)

    @Component.Builder
    interface Builder{
        fun cartDeps(deps: AuthDeps): Builder
        fun build(): AuthComponent

    }
}
@Module
class AuthModule


interface AuthDeps : Dependencies{
    val authNavCommandProvider : AuthNavCommandProvider
}