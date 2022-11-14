package pat.project.ecompatproject.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import pat.project.ecompatproject.ProjectApplication
import pat.project.ecompatproject.di.feature_deps.HomeDepsModule
import pat.project.ecompatproject.di.feature_deps.SplashScreenDepsModule
import pat.project.home.presentation.di.HomeDeps
import pat.project.splashscreen.presentation.di.SplashScreenDeps

@Component(modules = [AppModule::class, SplashScreenDepsModule::class, HomeDepsModule::class])
interface AppComponent : SplashScreenDeps, HomeDeps {

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