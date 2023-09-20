package uz.gita.mmemorygame.presentation.viewmodels.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import uz.gita.mmemorygame.domain.Repository
import uz.gita.mmemorygame.presentation.viewmodels.impl.GameViewModelImpl

class GameViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(GameViewModelImpl::class.java)) {
            return GameViewModelImpl(Repository.getInstance()) as T
        }

        throw IllegalArgumentException()
    }
}