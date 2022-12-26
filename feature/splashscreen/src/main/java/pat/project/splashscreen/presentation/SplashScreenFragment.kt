package pat.project.splashscreen.presentation

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.coroutines.*
import pat.project.dagger.findDependencies
import pat.project.ecompatproject.feature.splashscreen.R
import pat.project.navigation.navigate
import pat.project.splashscreen.presentation.di.DaggerSplashScreenComponent
import pat.project.splashscreen.presentation.navigation.SplashNavCommandProvider
import javax.inject.Inject

@SuppressLint("CustomSplashScreen")
class SplashScreenFragment : Fragment(R.layout.splash_screen_fragment) {

    @Inject
    lateinit var navCommandProvider: SplashNavCommandProvider

    //create simulate like in real project data loading and verification
    private suspend fun simulateDataLoading() {
        delay(3000)
    }

    override fun onAttach(context: Context) {
        DaggerSplashScreenComponent.builder()
            .splashScreenDeps(findDependencies())
            .build()
            .inject(this)
        super.onAttach(context)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val scope = CoroutineScope(Dispatchers.Main)
        scope.launch {
            simulateDataLoading()
        }.invokeOnCompletion {
            navigate(navCommandProvider.toAuth)

        }
        return super.onCreateView(inflater, container, savedInstanceState)
    }

}