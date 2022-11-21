plugins {
    id("com.android.library")
    kotlin("android")
    id("kotlin-kapt")
}

android {
    namespace = NameSpaces.featureHomeNameSpace
    compileSdk = Config.compileSdkVersion

    defaultConfig {
        minSdk = Config.minSdkVersion
        targetSdk = Config.targetSdkVersion

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        named("release") {
            isMinifyEnabled = false
            setProguardFiles(
                listOf(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
                )
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures{
        viewBinding = true
    }
}

dependencies {
    //project modules
    implementation(project(":core:ui"))
    implementation(project(":core:navigation"))
    implementation(project(":core:home-api-interface"))

    implementation(project(":core:dagger"))

    implementation(project(":network-utils"))

    //viewBinding
    implementation(Dependencies.ViewBinding.viewbindingpropertydelegate)

    //viewModels delegate
    implementation(Dependencies.KtxLibraries.fragmentKtx)

    //glide
    implementation(Dependencies.Glide.glideImageLoader)
    kapt(Dependencies.Glide.glideAnnotationProcessor)

    //dagger
    implementation(Dependencies.Dagger.dagger)
    kapt(Dependencies.Dagger.daggerCompiler)
    kapt(Dependencies.Dagger.daggerAndroidProcessor)

    //android deps
    implementation(Dependencies.Android.coreKtx)
    implementation(Dependencies.Android.appCompat)
    implementation(Dependencies.Android.material)

    //unit and android tests
    testImplementation(Dependencies.Test.jUnit)
    androidTestImplementation(Dependencies.Test.espresso)
    androidTestImplementation(Dependencies.Test.androidJUnit)
}