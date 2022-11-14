package pat.project.home.presentation.di

import dagger.Component
import dagger.Module
import pat.project.dagger.Dependencies
import pat.project.home.presentation.ui.HomeFragment

@Component(modules = [HomeModule::class], dependencies = [HomeDeps::class])
interface HomeComponent {
    @Component.Builder
    interface Builder {
        fun homeDeps(deps: HomeDeps): Builder
        fun build(): HomeComponent
    }

    fun inject(homeFragment: HomeFragment)
}

@Module
class HomeModule

interface HomeDeps : Dependencies