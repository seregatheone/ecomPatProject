package pat.project.splashscreen

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val intent = Intent()
        // TODO add Router/Navigator and rework hardcoded MainActivity link
        intent.setClassName(
            packageName,
            "pat.project.ecompatproject.MainActivity"
        )
        startActivity(intent)
        finish()
        super.onCreate(savedInstanceState)
    }
}