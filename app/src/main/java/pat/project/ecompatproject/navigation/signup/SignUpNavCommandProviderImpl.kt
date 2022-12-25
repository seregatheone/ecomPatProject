package pat.project.ecompatproject.navigation.signup

import pat.project.ecompatproject.R
import pat.project.navigation.NavCommand
import pat.project.signup.presentation.navigation.SignUpNavCommandProvider
import javax.inject.Inject

class SignUpNavCommandProviderImpl @Inject constructor() : SignUpNavCommandProvider{
    override val toHomeScreen: NavCommand = NavCommand(R.id.action_signUpFragment_to_homeFragment)
}