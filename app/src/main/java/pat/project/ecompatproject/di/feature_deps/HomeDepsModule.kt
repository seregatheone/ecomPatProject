package pat.project.ecompatproject.di.feature_deps

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import pat.project.dagger.Dependencies
import pat.project.dagger_annotations.DependenciesKey
import pat.project.ecompatproject.di.AppComponent
import pat.project.ecompatproject.navigation.home.HomeNavCommandProviderImpl
import pat.project.home.presentation.di.HomeDeps
import pat.project.home.presentation.navigation.HomeNavCommandProvider

@Module
interface HomeDepsModule {
    @Binds
    @IntoMap
    @DependenciesKey(HomeDeps::class)
    fun bindHomeScreenDeps(appComponent: AppComponent): Dependencies

    @Binds
    fun bindHomeNavCommandProvider(homeNavCommandProviderImpl: HomeNavCommandProviderImpl): HomeNavCommandProvider
}