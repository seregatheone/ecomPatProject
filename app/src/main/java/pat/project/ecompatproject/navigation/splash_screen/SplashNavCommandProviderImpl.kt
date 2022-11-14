package pat.project.ecompatproject.navigation.splash_screen

import pat.project.ecompatproject.R
import pat.project.navigation.NavCommand
import pat.project.splashscreen.presentation.navigation.SplashNavCommandProvider
import javax.inject.Inject

class SplashNavCommandProviderImpl @Inject constructor() : SplashNavCommandProvider{
    override val toHome: NavCommand = NavCommand(R.id.action_splashScreenFragment_to_homeFragment)
}