plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    namespace = NameSpaces.coreDaggerAnnotationsNameSpace
    compileSdk = Config.compileSdkVersion

    defaultConfig{
        minSdk = Config.minSdkVersion
        targetSdk = Config.targetSdkVersion
    }
}
dependencies{
    implementation(Dependencies.Dagger.dagger)
    api(project(":core:dagger"))
}