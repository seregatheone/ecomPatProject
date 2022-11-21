plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    namespace = NameSpaces.coreProductDetailedApiInterfaceNameSpace
    compileSdk = Config.compileSdkVersion

    defaultConfig{
        minSdk = Config.minSdkVersion
        targetSdk = Config.targetSdkVersion
    }
}
dependencies{
    implementation(Dependencies.Network.retrofit)
}