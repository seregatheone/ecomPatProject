package pat.project.ecompatproject

import android.app.Application
import pat.project.dagger.DepsMap
import pat.project.dagger.HasDependencies
import pat.project.ecompatproject.di.DaggerAppComponent
import javax.inject.Inject

class ProjectApplication : Application(), HasDependencies {

    @Inject
    override lateinit var depsMap: DepsMap

    override fun onCreate() {
        DaggerAppComponent.builder()
            .application(this)
            .build()
            .inject(this)
        super.onCreate()
    }
}