package pat.project.ecompatproject.di.feature_deps

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import pat.project.cart.presentation.di.CartDeps
import pat.project.cart.presentation.navigation.CartNavCommandProvider
import pat.project.dagger.Dependencies
import pat.project.dagger_annotations.DependenciesKey
import pat.project.ecompatproject.di.AppComponent
import pat.project.ecompatproject.navigation.cart.CartNavCommandProviderImpl

@Module
interface CartDepsModule {
    @Binds
    @IntoMap
    @DependenciesKey(CartDeps::class)
    fun bindCartScreenDeps(appComponent: AppComponent): Dependencies

    @Binds
    fun bindCartNavCommandProvider(cartNavCommandProviderImpl: CartNavCommandProviderImpl): CartNavCommandProvider
}