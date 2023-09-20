package uz.gita.mmemorygame.presentation.screens

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import by.kirich1409.viewbindingdelegate.viewBinding
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import uz.gita.mmemorygame.R
import uz.gita.mmemorygame.databinding.ScreenSplashBinding
import uz.gita.mmemorygame.presentation.navigation.AppNavigationDispatcher
import uz.gita.mmemorygame.presentation.navigation.AppNavigator

@SuppressLint("CustomSplashScreen")
class SplashScreen : Fragment(R.layout.screen_splash) {
    private val binding by viewBinding(ScreenSplashBinding::bind)
    private val appNavigator: AppNavigator = AppNavigationDispatcher
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

            lifecycleScope.launch {
                animate()
                appNavigator.navigateTo(SplashScreenDirections.actionSplashScreenToHomeScreen())
            }

    }

    private suspend fun animate() {
        binding.logo.animate()
            .setDuration(2000)
            .alpha(1f)
            .start()
        delay(2200)
    }

}