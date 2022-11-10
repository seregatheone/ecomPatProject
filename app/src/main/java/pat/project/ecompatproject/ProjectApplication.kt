package pat.project.ecompatproject

import android.app.Application
import pat.project.ecompatproject.di.DaggerAppComponent

class ProjectApplication : Application() {

    override fun onCreate() {
        DaggerAppComponent.builder()
            .application(this)
            .build()
            .inject(this)
        super.onCreate()
    }
}