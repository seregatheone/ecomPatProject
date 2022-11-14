package pat.project.ecompatproject.presentation

import androidx.appcompat.app.AppCompatActivity
import by.kirich1409.viewbindingdelegate.viewBinding
import pat.project.ecompatproject.R
import pat.project.ecompatproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(R.layout.activity_main){
    private val viewBinding by viewBinding(ActivityMainBinding::bind)
}
