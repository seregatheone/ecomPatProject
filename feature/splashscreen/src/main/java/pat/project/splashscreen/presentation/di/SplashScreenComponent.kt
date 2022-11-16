package pat.project.splashscreen.presentation.di

import dagger.Component
import dagger.Module
import pat.project.dagger.Dependencies
import pat.project.splashscreen.presentation.SplashScreenFragment
import pat.project.splashscreen.presentation.navigation.SplashNavCommandProvider

@Component(modules = [SplashScreenModule::class], dependencies = [SplashScreenDeps::class])
internal interface SplashScreenComponent {
    @Component.Builder
    interface Builder {
        fun splashScreenDeps(deps: SplashScreenDeps): Builder
        fun build(): SplashScreenComponent
    }

    fun inject(splashScreenFragment: SplashScreenFragment)
}

@Module
internal class SplashScreenModule

interface SplashScreenDeps : Dependencies {
    val splashScreenNavigation: SplashNavCommandProvider
}