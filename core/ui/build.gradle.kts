plugins {
    id("com.android.library")
}

android {
    namespace = NameSpaces.coreUiNameSpace
    compileSdk = Config.compileSdkVersion

    defaultConfig{
        minSdk = Config.minSdkVersion
        targetSdk = Config.targetSdkVersion
    }
}