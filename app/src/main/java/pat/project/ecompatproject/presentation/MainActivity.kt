package pat.project.ecompatproject.presentation

import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import by.kirich1409.viewbindingdelegate.viewBinding
import pat.project.ecompatproject.R
import pat.project.ecompatproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(R.layout.activity_main){
    private val viewBinding by viewBinding(ActivityMainBinding::bind)

    override fun onStart() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController = navHostFragment.navController

        navController.addOnDestinationChangedListener { _, destination, _ ->
            when(destination.id){
                R.id.splashScreenFragment-> viewBinding.bottomNavigation.visibility = View.GONE
                R.id.cart -> viewBinding.bottomNavigation.visibility = View.GONE
                else -> viewBinding.bottomNavigation.visibility = View.VISIBLE
            }
        }
        super.onStart()
    }
}
