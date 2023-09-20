package uz.gita.mmemorygame.presentation.navigation

import androidx.navigation.NavDirections
import kotlinx.coroutines.flow.MutableSharedFlow

object AppNavigationDispatcher : AppNavigationHandler, AppNavigator {
    override val buffer = MutableSharedFlow<AppNavigationArgs>()

    private suspend fun navigate(block: AppNavigationArgs) {
        buffer.emit(block)
    }

    override suspend fun navigateTo(directions: NavDirections) = navigate {
        navigate(directions)
    }

    override suspend fun navigateUp() = navigate {
        navigateUp()
    }


}