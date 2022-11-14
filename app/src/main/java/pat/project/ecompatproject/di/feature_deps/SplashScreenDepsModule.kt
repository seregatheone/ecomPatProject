package pat.project.ecompatproject.di.feature_deps

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import pat.project.dagger.Dependencies
import pat.project.dagger_annotations.DependenciesKey
import pat.project.ecompatproject.di.AppComponent
import pat.project.ecompatproject.navigation.splash_screen.SplashNavCommandProviderImpl
import pat.project.splashscreen.presentation.di.SplashScreenDeps
import pat.project.splashscreen.presentation.navigation.SplashNavCommandProvider

@Module
interface SplashScreenDepsModule {
    @Binds
    @IntoMap
    @DependenciesKey(SplashScreenDeps::class)
    fun bindSplashScreenDeps(appComponent: AppComponent): Dependencies

    @Binds
    fun bindSplashNavCommandProvider(splashNavCommandProviderImpl: SplashNavCommandProviderImpl): SplashNavCommandProvider
}