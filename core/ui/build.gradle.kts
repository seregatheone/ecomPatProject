plugins {
    id("com.android.library")
}

android {
    namespace = Config.nameSpace+".core_ui"
    compileSdk = Config.compileSdkVersion

    defaultConfig{
        minSdk = Config.minSdkVersion
        targetSdk = Config.targetSdkVersion
    }
}