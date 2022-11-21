package pat.project.ecompatproject.di.feature_deps

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import pat.project.dagger.Dependencies
import pat.project.dagger_annotations.DependenciesKey
import pat.project.ecompatproject.di.AppComponent
import pat.project.ecompatproject.navigation.bottom_navigation.BottomNavigation
import pat.project.ecompatproject.navigation.bottom_navigation.BottomNavigationImpl
import pat.project.ecompatproject.presentation.di.MainActivityDeps

@Module
interface MainDepsModule {
    @Binds
    @IntoMap
    @DependenciesKey(MainActivityDeps::class)
    fun bindMainScreenDeps(appComponent: AppComponent): Dependencies

    @Binds
    fun bindMainNavCommandProvider(bottomNavigationImpl: BottomNavigationImpl): BottomNavigation
}