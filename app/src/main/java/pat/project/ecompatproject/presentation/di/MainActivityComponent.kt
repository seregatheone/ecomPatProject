package pat.project.ecompatproject.presentation.di

import dagger.Component
import pat.project.dagger.Dependencies
import pat.project.ecompatproject.navigation.bottom_navigation.BottomNavigation
import pat.project.ecompatproject.presentation.MainActivity

@Component(dependencies = [MainActivityDeps::class])
interface MainActivityComponent {
    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {
        fun deps(mainActivityDeps:MainActivityDeps): Builder
        fun build(): MainActivityComponent
    }
}

interface MainActivityDeps : Dependencies{
    val bottomNavigation: BottomNavigation
}