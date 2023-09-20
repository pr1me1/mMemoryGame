package uz.gita.mmemorygame.presentation.navigation

import androidx.navigation.NavDirections

interface AppNavigator {
    suspend fun navigateTo(directions: NavDirections)
    suspend fun navigateUp()
//    suspend fun navigateBack()
}