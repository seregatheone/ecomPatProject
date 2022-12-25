package pat.project.ecompatproject.di.feature_deps

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import pat.project.auth.presentation.di.AuthDeps
import pat.project.auth.presentation.navigation.AuthNavCommandProvider
import pat.project.dagger.Dependencies
import pat.project.dagger_annotations.DependenciesKey
import pat.project.ecompatproject.di.AppComponent
import pat.project.ecompatproject.navigation.auth.AuthNavCommandProviderImpl

@Module
interface AuthDepsModule {
    @Binds
    @IntoMap
    @DependenciesKey(AuthDeps::class)
    fun bindAuthScreenDeps(appComponent: AppComponent): Dependencies

    @Binds
    fun bindAuthNavCommandProvider(authNavCommandProviderImpl: AuthNavCommandProviderImpl): AuthNavCommandProvider
}