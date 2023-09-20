package uz.gita.mmemorygame.presentation.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import uz.gita.mmemorygame.data.enums.CategoryEnum
import uz.gita.mmemorygame.data.enums.DifficultyEnum
import uz.gita.mmemorygame.data.models.CardData

interface GameViewModel {
    val cardsListLiveData: LiveData<List<CardData>>
    val attemptCounterLiveData: LiveData<Int>

    fun restart()
    fun click()
    fun loadCards(categoryEnum: CategoryEnum, difficultyEnum: DifficultyEnum)
}