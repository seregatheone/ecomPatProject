package pat.project.home.presentation.di

import dagger.Component
import dagger.Module
import pat.project.dagger.Dependencies
import pat.project.home.presentation.di.modules.HomeDataModule
import pat.project.home.presentation.ui.home.HomeFragment
import pat.project.home_api_interface.HomeApiService

@Component(modules = [HomeModule::class, HomeDataModule::class], dependencies = [HomeDeps::class])
internal interface HomeComponent {
    @Component.Builder
    interface Builder {
        fun homeDeps(deps: HomeDeps): Builder
        fun build(): HomeComponent
    }

    fun inject(homeFragment: HomeFragment)
}

@Module
internal class HomeModule

interface HomeDeps : Dependencies{
    val homeApiService : HomeApiService
}