package pat.project.cart.presentation.di

import dagger.Component
import dagger.Module
import pat.project.dagger.Dependencies

@Component(modules = [CartModule::class], dependencies = [CartDeps::class])
internal interface CartComponent {
    @Component.Builder
    interface Builder {
        fun cartDeps(deps: CartDeps): Builder
        fun build(): CartComponent
    }
}

@Module
internal class CartModule


interface CartDeps : Dependencies
