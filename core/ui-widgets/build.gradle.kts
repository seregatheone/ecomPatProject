plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    namespace = NameSpaces.coreUiWidgetsNameSpace
    compileSdk = Config.compileSdkVersion

    defaultConfig{
        minSdk = Config.minSdkVersion
        targetSdk = Config.targetSdkVersion
    }
}

dependencies{
    implementation(Dependencies.UiWidgets.supportRecyclerview)
}