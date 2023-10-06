package uz.gita.mmemorygame.presentation.screens


import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.gita.mmemorygame.R
import uz.gita.mmemorygame.data.enums.CategoryEnum
import uz.gita.mmemorygame.data.enums.DifficultyEnum
import uz.gita.mmemorygame.data.source.shared.Shared
import uz.gita.mmemorygame.databinding.ScreenHomeBinding
import uz.gita.mmemorygame.utils.debounce


class HomeScreen : Fragment(R.layout.screen_home) {
    private val binding by viewBinding(ScreenHomeBinding::bind)
    private var trans = 0f
    private val shared = Shared.getInstance()
    private lateinit var clickBtn: MediaPlayer
    private lateinit var backgroundSound: MediaPlayer



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setEvents()
        clickBtn = MediaPlayer.create(requireContext(), R.raw.click_btn)
        backgroundSound = MediaPlayer.create(requireContext(), R.raw.background_sound)
        backgroundSound.start()
        if(shared.getVolumeState()) {
            backgroundSound.setVolume(1f, 1f)
            binding.volumeState.setImageResource(R.drawable.ic_volume_up)
        }
        else {
            backgroundSound.setVolume(0f, 0f)
            binding.volumeState.setImageResource(R.drawable.ic_mute)
        }

        binding.btnInfo.setDebounceListener(){
            clickBtn.start()
            findNavController().navigate(R.id.action_homeScreen_to_infoScreen)
        }

        controlSound()

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






    private fun setEvents() {
        binding.btnEasy.setDebounceListener() {
            clickBtn.start()
            shared.saveDifficulty(DifficultyEnum.Easy)
            hideMainButtons(binding.btnEasy.id)
        }
        binding.btnMedium.setDebounceListener() {
            clickBtn.start()
            shared.saveDifficulty(DifficultyEnum.Medium)
            hideMainButtons(binding.btnMedium.id)
        }
        binding.btnHard.setDebounceListener() {
            clickBtn.start()
            shared.saveDifficulty(DifficultyEnum.Hard)
            hideMainButtons(binding.btnHard.id)
        }


        binding.btnWithAnimals.setDebounceListener(){
            clickBtn.start()
            findNavController().navigate(

                R.id.action_homeScreen_to_gameScreen, bundleOf(
                    "category" to CategoryEnum.Animals,
                    "difficulty" to shared.getDifficulty()
                )
            )
        }

        binding.btnWithFruits.setDebounceListener(){
            clickBtn.start()

            findNavController().navigate(
                R.id.action_homeScreen_to_gameScreen, bundleOf(
                    "category" to CategoryEnum.Fruits,
                    "difficulty" to shared.getDifficulty()
                )
            )
        }

        binding.btnWithVegetables.setDebounceListener(){
            clickBtn.start()
            findNavController().navigate(
                R.id.action_homeScreen_to_gameScreen, bundleOf(
                    "category" to CategoryEnum.Vegetables,
                    "difficulty" to shared.getDifficulty()
                )
            )
        }


        binding.btnBack.setDebounceListener() {
            clickBtn.start()
            showMainButtons()
        }
        binding.root.setDebounceListener() {
            clickBtn.start()
            showMainButtons()
        }
    }

    private fun hideMainButtons(id:Int) {
        trans = 100f
        binding.btnEasy.animate()
            .setDuration(200)
            .translationY(trans)
            .alpha(0f)
            .withEndAction {
                binding.btnMedium.animate()
                    .setDuration(200)
                    .translationY(trans)
                    .alpha(0f)
                    .withEndAction {
                        binding.btnHard.animate()
                            .setDuration(200)
                            .translationY(trans)
                            .alpha(0f)
                            .withEndAction{
                                binding.btnWithAnimals.visibility = View.VISIBLE
                                binding.btnWithVegetables.visibility = View.VISIBLE
                                binding.btnWithFruits.visibility = View.VISIBLE
                                binding.btnWithAnimals.animate()
                                    .setDuration(200)
                                    .translationY(-trans)
                                    .alpha(1f)
                                    .withEndAction{
                                        binding.btnWithVegetables.animate()
                                            .setDuration(200)
                                            .translationY(-trans)
                                            .alpha(1f)
                                            .withEndAction{
                                                binding.btnWithFruits.animate()
                                                    .setDuration(200)
                                                    .translationY(-trans)
                                                    .alpha(1f)
                                                    .start()
                                            }.start()
                                    }.start()
                            }.start()
                    }.start()
            }.start()

        binding.btnBack.animate().alpha(1f).setDuration(600).start()
    }

    private fun showMainButtons() {
        binding.btnWithAnimals.animate()
            .setDuration(200)
            .translationY(trans)
            .alpha(0f)
            .withEndAction{
                binding.btnWithAnimals.visibility = View.GONE
                binding.btnWithVegetables.animate()
                    .setDuration(200)
                    .translationY(trans)
                    .alpha(0f)
                    .withEndAction{
                        binding.btnWithVegetables.visibility = View.GONE
                        binding.btnWithFruits.animate()
                            .setDuration(200)
                            .translationY(trans)
                            .alpha(0f)
                            .withEndAction{
                                binding.btnWithAnimals.visibility = View.GONE
                                binding.btnEasy.animate()
                                    .setDuration(200)
                                    .translationY(-trans)
                                    .alpha(1f)
                                    .withEndAction {
                                        binding.btnMedium.animate()
                                            .setDuration(200)
                                            .translationY(-trans)
                                            .alpha(1f)
                                            .withEndAction {
                                                binding.btnHard.animate()
                                                    .setDuration(200)
                                                    .translationY(-trans)
                                                    .alpha(1f)
                                            }.start()
                                    }.start()
                            }.start()
                    }.start()
            }.start()

        binding.btnBack.animate().alpha(0f).setDuration(600).start()
    }

    private fun View.setDebounceListener(onClickListener: View.OnClickListener) {
        val scope = lifecycleScope
        val clickWithDebounce: (view: View) -> Unit =
            debounce(scope = scope) {
                onClickListener.onClick(it)
            }
        this.setOnClickListener(clickWithDebounce)
    }


    override fun onPause() {
        super.onPause()
        backgroundSound.setVolume(0f,0f)
    }


    override fun onResume() {
        super.onResume()
        if(shared.getVolumeState()) {
            backgroundSound.setVolume(1f, 1f)
        }
    }


    override fun onDestroy() {
        binding.btnWithAnimals.clearAnimation()
        binding.btnEasy.clearAnimation()
        backgroundSound.stop()
        super.onDestroy()
    }

}
