package pat.project.ecompatproject.navigation.home

import pat.project.ecompatproject.R
import pat.project.home.presentation.navigation.HomeNavCommandProvider
import pat.project.navigation.NavCommand
import javax.inject.Inject

class HomeNavCommandProviderImpl @Inject constructor() : HomeNavCommandProvider{
    override val toProductDetailed: NavCommand = NavCommand(R.id.action_homeFragment_to_productDetailedFragment)
}