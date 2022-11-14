package pat.project.cart.presentation.di

import dagger.Component
import dagger.Module
import pat.project.dagger.Dependencies

@Component(modules = [CartModule::class], dependencies = [CartDeps::class])
interface CartComponent {
    @Component.Builder
    interface Builder {
        fun cartDeps(deps: CartDeps): Builder
        fun build(): CartComponent
    }
}

@Module
class CartModule


interface CartDeps : Dependencies
