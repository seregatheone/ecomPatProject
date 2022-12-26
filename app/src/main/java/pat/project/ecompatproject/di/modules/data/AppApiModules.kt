package pat.project.ecompatproject.di.modules.data

import dagger.Module

@Module(includes = [HomeApiModule::class,LoginApiModule::class])
class AppApiModules