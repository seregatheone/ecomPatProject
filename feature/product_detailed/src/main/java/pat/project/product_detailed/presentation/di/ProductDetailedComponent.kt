package pat.project.product_detailed.presentation.di

import dagger.Component
import dagger.Module
import pat.project.dagger.Dependencies
import pat.project.product_detailed.presentation.ui.ProductDetailedFragment

@Component(dependencies = [ProductDetailedDeps::class])
internal interface ProductDetailedComponent {
    @Component.Builder
    interface Builder {
        fun homeDeps(deps: ProductDetailedDeps): Builder
        fun build(): ProductDetailedComponent
    }

    fun inject(productDetailedFragment: ProductDetailedFragment)
}

@Module
internal class HomeModule

interface ProductDetailedDeps : Dependencies