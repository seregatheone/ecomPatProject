object NameSpaces {
    ///////
    private const val appNameSpace = Config.appNameSpace

    ///   utils and others

    const val networkUtils = "$appNameSpace.network_utils"

    ///   core
    private const val coreNameSpace = "$appNameSpace.core"

    const val coreUiNameSpace = "$coreNameSpace.ui"
    const val coreDaggerNameSpace = "$coreNameSpace.dagger"
    const val coreDaggerAnnotationsNameSpace = "$coreNameSpace.dagger_annotations"
    const val coreNavigationNameSpace = "$coreNameSpace.navigation"
    const val coreHomeApiNameSpace = "$coreNameSpace.home_api"
    const val coreHomeApiInterfaceNameSpace = "$coreNameSpace.home_api_interface"

    ///   features
    private const val featureNameSpace = "$appNameSpace.feature"

    const val featureSplashScreenNameSpace = "$featureNameSpace.splashscreen"
    const val featureHomeNameSpace = "$featureNameSpace.home"
    const val featureCartNameSpace = "$featureNameSpace.cart"
}