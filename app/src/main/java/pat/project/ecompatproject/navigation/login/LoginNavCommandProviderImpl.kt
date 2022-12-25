package pat.project.ecompatproject.navigation.login

import pat.project.ecompatproject.R
import pat.project.login.presentation.navigation.LoginNavCommandProvider
import pat.project.navigation.NavCommand
import javax.inject.Inject

class LoginNavCommandProviderImpl @Inject constructor() : LoginNavCommandProvider{
    override val toHomeScreen: NavCommand = NavCommand(R.id.action_loginFragment2_to_homeFragment)
}