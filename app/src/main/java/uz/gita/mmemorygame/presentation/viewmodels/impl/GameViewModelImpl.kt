package uz.gita.mmemorygame.presentation.viewmodels.impl

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import uz.gita.mmemorygame.data.enums.CategoryEnum
import uz.gita.mmemorygame.data.enums.DifficultyEnum
import uz.gita.mmemorygame.data.models.CardData
import uz.gita.mmemorygame.domain.Repository
import uz.gita.mmemorygame.presentation.viewmodels.GameViewModel

class GameViewModelImpl constructor(private val repository: Repository) : ViewModel(), GameViewModel {
    override val cardsListLiveData = MutableLiveData<List<CardData>>()
    override val attemptCounterLiveData = MutableLiveData<Int>()
    private var counter = 0


    override fun restart() {
        counter = 0
    }

    override fun click() {
        counter++
        attemptCounterLiveData.value = counter
    }

    override fun loadCards(categoryEnum: CategoryEnum, difficultyEnum: DifficultyEnum) {
        cardsListLiveData.value = repository.getCards(difficultyEnum, categoryEnum )
    }
}