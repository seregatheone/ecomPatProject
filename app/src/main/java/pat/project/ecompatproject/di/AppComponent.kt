package pat.project.ecompatproject.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import pat.project.ecompatproject.ProjectApplication

@Component
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application):Builder

        fun build(): AppComponent
    }

    fun inject(projectApplication: ProjectApplication)
}
