plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    namespace = Config.nameSpace+".core_dagger_annotations"
    compileSdk = Config.compileSdkVersion

    defaultConfig{
        minSdk = Config.minSdkVersion
        targetSdk = Config.targetSdkVersion
    }
}
dependencies{
    api(Dependencies.Dagger.dagger)
    api(project(":core:dagger"))
}