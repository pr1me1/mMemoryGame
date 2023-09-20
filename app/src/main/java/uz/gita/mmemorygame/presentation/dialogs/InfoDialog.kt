package uz.gita.mmemorygame.presentation.dialogs

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.speech.tts.TextToSpeech.OnInitListener
import android.util.Log
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.lifecycleScope
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.gita.mmemorygame.R
import uz.gita.mmemorygame.app.App
import uz.gita.mmemorygame.data.models.CardData
import uz.gita.mmemorygame.databinding.DialogInfoBinding
import uz.gita.mmemorygame.utils.debounce
import java.util.Locale


class InfoDialog : DialogFragment(R.layout.dialog_info), OnInitListener {
    private val binding by viewBinding(DialogInfoBinding::bind)
    private lateinit var cardData: CardData
    private lateinit var tts: TextToSpeech

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tts = TextToSpeech(requireContext(), this)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        cardData = requireArguments().getSerializable("data") as CardData


        binding.info.text = cardData.info
        binding.image.setImageResource(cardData.image)
        binding.playSound.setDebounceListener(){
            speakOut()
        }
    }


    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS) {
            val result = tts.setLanguage(Locale.UK)

            if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                "asdfds".chars()
            } else {
                binding.playSound.isEnabled = true
            }

        } else {
            "asdfds".chars()
        }
    }



    private fun speakOut() {
        val text = binding.info.text
        tts.speak(text, TextToSpeech.QUEUE_FLUSH, null,"")
    }


    override fun onResume() {
        super.onResume()
        dialog!!.window!!.setLayout(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        dialog!!.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
    }

    override fun onPause() {
        super.onPause()

            tts.stop()
            tts.shutdown()

    }

    override fun onDestroy() {
        super.onDestroy()
        if (!::tts.isInitialized) {
            tts.stop()
            tts.shutdown()
        }
    }

    private fun View.setDebounceListener(onClickListener: View.OnClickListener) {
        val scope = lifecycleScope
        val clickWithDebounce: (view: View) -> Unit =
            debounce(scope = scope) {
                onClickListener.onClick(it)
            }
        this.setOnClickListener(clickWithDebounce)
    }
}