plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    namespace = NameSpaces.coreHomeApiNameSpace
    compileSdk = Config.compileSdkVersion

    defaultConfig{
        minSdk = Config.minSdkVersion
        targetSdk = Config.targetSdkVersion
    }

    buildTypes {
        getByName(Config.BUILD_TYPE_RELEASE) {
            buildConfigField(
                Config.TYPE_STRING,
                Config.CONFIG_FIELD_MOCK,
                Config.BACKEND_ENDPOINT_PROD
            )
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
        getByName(Config.BUILD_TYPE_DEBUG) {
            buildConfigField(
                Config.TYPE_STRING,
                Config.CONFIG_FIELD_MOCK,
                Config.BACKEND_ENDPOINT_DEV
            )
            isMinifyEnabled = false
        }
    }
}
dependencies{
    api(project(":core:home-api-interface"))


    implementation(Dependencies.Network.retrofit)
    implementation(Dependencies.Network.gsonConverterFactory)

    //unit and android tests
    testImplementation(Dependencies.Test.jUnit)
    androidTestImplementation(Dependencies.Test.espresso)
    androidTestImplementation(Dependencies.Test.androidJUnit)
}