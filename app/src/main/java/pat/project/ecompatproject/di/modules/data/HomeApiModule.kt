package pat.project.ecompatproject.di.modules.data

import dagger.Module
import dagger.Provides
import pat.project.home_api.HomeRetrofitBuilder
import pat.project.home_api_interface.HomeApiService

@Module
class HomeApiModule {
    @Provides
    fun provideHomeApiService() : HomeApiService = HomeRetrofitBuilder.homeApiService()
}