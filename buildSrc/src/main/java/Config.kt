object Config {
    const val appNameSpace = "pat.project.ecompatproject"
    const val compileSdkVersion = 33
    const val minSdkVersion = 23
    const val targetSdkVersion = 33
    const val versionCode = 1
    const val versionName = "1.0.0"
    ///////
    private const val coreNameSpace = "$appNameSpace.core"

    const val coreUiNameSpace = "$coreNameSpace.ui"
    const val coreDaggerNameSpace = "$coreNameSpace.dagger"
    const val coreDaggerAnnotationsNameSpace = "$coreNameSpace.dagger_annotations"
    /////////
    private const val featureNameSpace = "$appNameSpace.feature"

    const val featureSplashScreen = "$featureNameSpace.splashscreen"
}