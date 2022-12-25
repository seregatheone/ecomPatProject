package pat.project.ecompatproject.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import pat.project.auth.presentation.di.AuthDeps
import pat.project.cart.presentation.di.CartDeps
import pat.project.ecompatproject.ProjectApplication
import pat.project.ecompatproject.di.feature_deps.FeatureDepsModules
import pat.project.ecompatproject.di.modules.data.AppApiModules
import pat.project.ecompatproject.presentation.di.MainActivityDeps
import pat.project.home.presentation.di.HomeDeps
import pat.project.login.presentation.di.LoginDeps
import pat.project.signup.presentation.di.SignUpDeps
import pat.project.splashscreen.presentation.di.SplashScreenDeps

@Component(modules = [AppModule::class, FeatureDepsModules::class, AppApiModules::class])
interface AppComponent : SplashScreenDeps, HomeDeps, CartDeps, MainActivityDeps, AuthDeps,
    SignUpDeps, LoginDeps {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder
        fun build(): AppComponent
    }

    fun inject(projectApplication: ProjectApplication)
}

@Module
class AppModule