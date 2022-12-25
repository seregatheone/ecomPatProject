package pat.project.login.presentation.navigation

import pat.project.navigation.NavCommand

interface LoginNavCommandProvider{
    val toHomeScreen: NavCommand
}