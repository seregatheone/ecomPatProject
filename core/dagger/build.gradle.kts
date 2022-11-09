plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    namespace = Config.nameSpace
    compileSdk = Config.compileSdkVersion

    defaultConfig{
        minSdk = Config.minSdkVersion
        targetSdk = Config.targetSdkVersion
    }
}
dependencies{
    implementation(Dependencies.Kotlin.kotlinStdLib)
    implementation(Dependencies.Android.appCompat)
}