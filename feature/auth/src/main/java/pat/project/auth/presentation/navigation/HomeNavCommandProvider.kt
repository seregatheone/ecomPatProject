package pat.project.auth.presentation.navigation

import pat.project.navigation.NavCommand

interface AuthNavCommandProvider{
    val toLoginScreen : NavCommand
    val toSignUpScreen : NavCommand
}