plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    namespace = NameSpaces.networkUtils
    compileSdk = Config.compileSdkVersion

    defaultConfig{
        minSdk = Config.minSdkVersion
        targetSdk = Config.targetSdkVersion
    }
}
