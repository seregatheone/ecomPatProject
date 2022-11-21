package pat.project.ecompatproject.navigation.bottom_navigation

import pat.project.ecompatproject.R
import pat.project.navigation.NavCommand
import javax.inject.Inject

class BottomNavigationImpl @Inject constructor() : BottomNavigation {
    override val toCard: NavCommand = NavCommand(R.id.action_feature_cart)
}