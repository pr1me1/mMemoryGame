package uz.gita.mmemorygame.presentation.navigation

import kotlinx.coroutines.flow.SharedFlow
import uz.gita.mmemorygame.presentation.navigation.AppNavigationArgs

interface AppNavigationHandler {
    val buffer: SharedFlow<AppNavigationArgs>
}