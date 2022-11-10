plugins {
    id("com.android.library")
}

android {
    namespace = Config.coreUiNameSpace
    compileSdk = Config.compileSdkVersion

    defaultConfig{
        minSdk = Config.minSdkVersion
        targetSdk = Config.targetSdkVersion
    }
}