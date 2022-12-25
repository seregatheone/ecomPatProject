package pat.project.ecompatproject.di.feature_deps

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import pat.project.dagger.Dependencies
import pat.project.dagger_annotations.DependenciesKey
import pat.project.ecompatproject.di.AppComponent
import pat.project.ecompatproject.navigation.login.LoginNavCommandProviderImpl
import pat.project.login.presentation.di.LoginDeps
import pat.project.login.presentation.navigation.LoginNavCommandProvider

@Module
interface LoginDepsModule {
    @Binds
    @IntoMap
    @DependenciesKey(LoginDeps::class)
    fun bindLoginScreenDeps(appComponent: AppComponent): Dependencies

    @Binds
    fun bindLoginNavCommandProvider(loginNavCommandProviderImpl: LoginNavCommandProviderImpl): LoginNavCommandProvider
}