package pat.project.ecompatproject.navigation.auth

import pat.project.auth.presentation.navigation.AuthNavCommandProvider
import pat.project.ecompatproject.R
import pat.project.navigation.NavCommand
import javax.inject.Inject

class AuthNavCommandProviderImpl @Inject constructor(

) : AuthNavCommandProvider{
    override val toLoginScreen: NavCommand = NavCommand(R.id.action_authFragment_to_loginFragment2)
    override val toSignUpScreen: NavCommand = NavCommand(R.id.action_authFragment_to_signUpFragment)
}