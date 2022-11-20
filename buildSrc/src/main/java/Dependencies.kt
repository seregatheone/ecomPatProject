object Dependencies {

    object Android {
        const val coreKtx = "androidx.core:core-ktx:1.8.0"
        const val appCompat = "androidx.appcompat:appcompat:1.5.1"
        const val material = "com.google.android.material:material:1.7.0"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.1.4"
    }

    object Navigation{
        const val navigationFragmentKtx = "androidx.navigation:navigation-fragment-ktx:2.5.3"
        const val navigationUi = "androidx.navigation:navigation-ui-ktx:2.5.3"
    }

    object Test {
        const val jUnit = "junit:junit:4.13.2"
        const val androidJUnit = "androidx.test.ext:junit:1.1.3"
        const val espresso = "androidx.test.espresso:espresso-core:3.4.0"
    }

    object Kotlin{
        const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib:${Plugins.kotlinVersion}"
    }

    object Dagger {
        private const val daggerVersion = "2.44"
        const val dagger = "com.google.dagger:dagger:$daggerVersion"
        const val daggerCompiler = "com.google.dagger:dagger-compiler:$daggerVersion"
        const val daggerAndroidProcessor = "com.google.dagger:dagger-android-processor:$daggerVersion"
    }

    object ViewBinding{
        const val viewbindingpropertydelegate = "com.github.kirich1409:viewbindingpropertydelegate-noreflection:1.5.6"
    }

    object Network{
        private const val retrofitVersion = "2.9.0"
        const val retrofit = "com.squareup.retrofit2:retrofit:$retrofitVersion"
        const val gsonConverterFactory = "com.squareup.retrofit2:converter-gson:$retrofitVersion"
    }

    object KtxLibraries{
        const val fragmentKtx = "androidx.fragment:fragment-ktx:1.5.4"
    }

    object Glide{
        private const val glideVersion = "4.14.2"
        const val glideImageLoader = "com.github.bumptech.glide:glide:$glideVersion"
        const val glideAnnotationProcessor = "com.github.bumptech.glide:compiler:$glideVersion"
    }

}