plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    namespace = NameSpaces.coreNavigationNameSpace
    compileSdk = Config.compileSdkVersion

    defaultConfig{
        minSdk = Config.minSdkVersion
        targetSdk = Config.targetSdkVersion
    }
}
dependencies{
    implementation(Dependencies.Navigation.navigationFragmentKtx)
    implementation(Dependencies.Navigation.navigationUi)
}