package pat.project.ecompatproject.di.feature_deps

import dagger.Module

@Module(includes = [SplashScreenDepsModule::class, HomeDepsModule::class, MainDepsModule::class])
class FeatureDepsModules