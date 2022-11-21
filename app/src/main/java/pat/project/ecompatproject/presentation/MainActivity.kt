package pat.project.ecompatproject.presentation

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import by.kirich1409.viewbindingdelegate.viewBinding
import pat.project.dagger.findDependencies
import pat.project.ecompatproject.R
import pat.project.ecompatproject.databinding.ActivityMainBinding
import pat.project.ecompatproject.navigation.bottom_navigation.BottomNavigation
import pat.project.ecompatproject.presentation.di.DaggerMainActivityComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity(R.layout.activity_main){
    private val viewBinding by viewBinding(ActivityMainBinding::bind)

    @Inject
    lateinit var bottomNavigation: BottomNavigation

    override fun onCreate(savedInstanceState: Bundle?) {
        DaggerMainActivityComponent.builder()
            .deps(findDependencies())
            .build()
            .inject(this)
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        viewBinding.cart.setOnClickListener {
            findNavController(viewBinding.fragmentContainerView.id).navigate(bottomNavigation.toCard.action)
        }

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
