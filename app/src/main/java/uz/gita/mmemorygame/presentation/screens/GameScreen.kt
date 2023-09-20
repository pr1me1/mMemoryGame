package uz.gita.mmemorygame.presentation.screens

import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import android.view.View.GONE
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import uz.gita.mmemorygame.R
import uz.gita.mmemorygame.data.enums.CategoryEnum
import uz.gita.mmemorygame.data.enums.DifficultyEnum
import uz.gita.mmemorygame.data.models.CardData
import uz.gita.mmemorygame.data.source.shared.Shared
import uz.gita.mmemorygame.databinding.ScreenGameBinding
import uz.gita.mmemorygame.presentation.customViews.CardHolder
import uz.gita.mmemorygame.presentation.dialogs.InfoDialog
import uz.gita.mmemorygame.presentation.viewmodels.factory.GameViewModelFactory
import uz.gita.mmemorygame.presentation.viewmodels.impl.GameViewModelImpl
import uz.gita.mmemorygame.utils.closeCard
import uz.gita.mmemorygame.utils.hideCard
import uz.gita.mmemorygame.utils.openCard

class GameScreen : Fragment(R.layout.screen_game) {
    private val binding by viewBinding(ScreenGameBinding::bind)
    private lateinit var difficulty: DifficultyEnum
    private lateinit var category: CategoryEnum
    private val viewModel by lazy { ViewModelProvider(this, GameViewModelFactory())[GameViewModelImpl::class.java] }
    private var heightImage = 0
    private var widthImage = 0
    private var centerX = 0
    private var centerY = 0
    private var count = 0
    private var firstCard = -1
    private var secondCard = -1
    private lateinit var pop: MediaPlayer
    private lateinit var clickBtn: MediaPlayer
    private var isClicked = false
    private lateinit var find: MediaPlayer
    private lateinit var backgroundSound: MediaPlayer
    private val shared = Shared.getInstance()


    private val cards = ArrayList<CardHolder>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        pop = MediaPlayer.create(requireContext(), R.raw.pop)
        clickBtn = MediaPlayer.create(requireContext(), R.raw.click_btn)
        find = MediaPlayer.create(requireContext(), R.raw.find)
        backgroundSound = MediaPlayer.create(requireContext(), R.raw.background_sound)
        backgroundSound.start()
        if(shared.getVolumeState())
            backgroundSound.setVolume(1f, 1f)
        else
            backgroundSound.setVolume(0f, 0f)

        binding.volumeState.setImageResource(if(shared.getVolumeState()) R.drawable.ic_volume_up else R.drawable.ic_mute)

        difficulty = requireArguments().getSerializable("difficulty") as DifficultyEnum
        category = requireArguments().getSerializable("category") as CategoryEnum
                binding.tvLevel.text = difficulty.name

        viewModel.attemptCounterLiveData.observe(viewLifecycleOwner){binding.tvAttempt.text = "$it"}

        start()

        binding.btnHome.setOnClickListener {
            clickBtn.start()
            findNavController().popBackStack()
        }

        binding.btnRestart.setOnClickListener {
            lifecycleScope.launch{ clearCards() }
            cards.clear()
            firstCard = -1
            secondCard = -1
            viewModel.restart()
            start()
            binding.btnHome.visibility = GONE
            count = 0
        }

        controlSound()

    }

    private suspend fun clearCards() {

        for (i in cards.indices) {
            cards[i].hideCard {  }
        }
        delay(1500)
    }

    private fun start() {
        binding.cardContainer.post {
            heightImage =
                (binding.cardContainer.height) / difficulty.verticalItems
            widthImage =
                (binding.cardContainer.width ) / difficulty.horizontalItems
            centerX = binding.cardContainer.width / 2
            centerY = binding.cardContainer.height / 2
            viewModel.loadCards(category, difficulty)
            viewModel.cardsListLiveData.observe(viewLifecycleOwner, cardObserver)
        }
    }

    private fun controlSound() {
        binding.volumeState.setOnClickListener {
            if (shared.getVolumeState()) {
                backgroundSound.setVolume(0f, 0f)
                shared.muteVolume()
                binding.volumeState.setImageResource(R.drawable.ic_mute)
            }
            else{
                backgroundSound.setVolume(1f, 1f)
                shared.unmuteVolume()
                binding.volumeState.setImageResource(R.drawable.ic_volume_up)
            }
        }
    }

    private val cardObserver = Observer<List<CardData>>{
        for (i in 0 until difficulty.verticalItems) {
            for (j in 0 until difficulty.horizontalItems) {
                val card = CardHolder(requireContext())
                binding.cardContainer.addView(card)
                val lp = card.layoutParams as ConstraintLayout.LayoutParams
                lp.apply {
                    height = heightImage
                    width = widthImage - 6
                }
                card.x = centerX * 1f
                card.y = centerY * 1f
                card.layoutParams = lp
                card.tag = it[i*difficulty.horizontalItems + j]
                card.setFieldColor(resources.getColor(R.color.white))
                card.setImage(R.drawable.question_mark)
                card.animate()
                    .setDuration(500)
                    .x(j * (/*3 +*/ widthImage) * 1f)
                    .y(i * (/*3 +*/ heightImage) * 1f)
                    .start()
                cards.add(card)
            }
        }

        setEvents()
    }


    private fun setEvents() {
        cards.forEachIndexed() {index, card ->
                card.setOnClickListener {
                    lifecycleScope.launch {
                        if (firstCard == -1 && index != firstCard) {
                            openFirstCard(card, index)
                        }
                        if (secondCard == -1 && index != firstCard && index != secondCard) {
                            openSecondCard(card, index)
                        }
                    }
                }
        }
    }


    private fun check() {
        if ((cards[firstCard].tag as CardData).id == (cards[secondCard].tag as CardData).id) {
            val info = InfoDialog()
            find.start()
            info.arguments = bundleOf("data" to (cards[firstCard].tag as CardData))
            info.show(parentFragmentManager, null)
            Handler(Looper.getMainLooper()).postDelayed({
                cards[firstCard].hideCard {}
                cards[secondCard].hideCard {
                    firstCard = -1
                    secondCard = -1
                    count += 2
                    if (count >= cards.size) {
                        binding.btnHome.visibility = View.VISIBLE
                    }
                }
            }, 200)


        } else {
            Handler(Looper.getMainLooper()).postDelayed({
                cards[firstCard].closeCard {}
                cards[secondCard].closeCard {
                    firstCard = -1
                    secondCard = -1
                }
            }, 200)

        }
    }


    private suspend fun openFirstCard(card: CardHolder, index: Int) {
        isClicked = true
        pop.start()
        firstCard = index
        viewModel.click()
        card.openCard()
        delay(300)
        isClicked = false
    }

    private suspend fun openSecondCard(card: CardHolder, index: Int) {
        if (isClicked) {
            delay(400)
        }
        secondCard = index
        viewModel.click()
        card.openCard {
            check()
        }
        pop.start()

    }


    override fun onPause() {
        super.onPause()
        backgroundSound.stop()
    }

}