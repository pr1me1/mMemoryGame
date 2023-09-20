package uz.gita.mmemorygame.presentation.screens

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import by.kirich1409.viewbindingdelegate.viewBinding
import kotlinx.coroutines.launch
import uz.gita.mmemorygame.R
import uz.gita.mmemorygame.databinding.ScreenInfoBinding
import uz.gita.mmemorygame.presentation.navigation.AppNavigationDispatcher
import uz.gita.mmemorygame.presentation.navigation.AppNavigator

class InfoScreen : Fragment(R.layout.screen_info) {
    private val binding: ScreenInfoBinding by viewBinding(ScreenInfoBinding::bind)
    private val appNavigator: AppNavigator = AppNavigationDispatcher

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnBack.setOnClickListener {
           lifecycleScope.launch { appNavigator.navigateUp() }
        }
    }
}