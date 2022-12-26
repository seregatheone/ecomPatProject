package pat.project.ecompatproject.di.modules.data

import dagger.Module
import dagger.Provides
import pat.project.home_api.HomeRetrofitBuilder
import pat.project.home_api_interface.HomeApiService
import pat.project.login_api.LoginRetrofitBuilder
import pat.project.login_api_interface.LoginApiService

@Module
class LoginApiModule {
    @Provides
    fun provideLoginApiService() : LoginApiService = LoginRetrofitBuilder.loginApiService()
}