package uz.gita.mmemorygame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentContainerView
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.NavHostFragment
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import uz.gita.mmemorygame.databinding.ActivityMainBinding
import uz.gita.mmemorygame.presentation.navigation.AppNavigationDispatcher
import uz.gita.mmemorygame.presentation.navigation.AppNavigationHandler

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    private lateinit var binding: ActivityMainBinding
    private val handler: AppNavigationHandler = AppNavigationDispatcher



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val containerView = findViewById<FragmentContainerView>(R.id.navHost)
        val navController = containerView.getFragment<NavHostFragment>().navController
        navController.clearBackStack(R.id.splashScreen)
        handler.buffer
            .onEach { it(navController) }
            .launchIn(lifecycleScope)
    }
}