package uz.gita.mmemorygame.utils

import android.graphics.Color
import android.os.Message
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import uz.gita.mmemorygame.R
import uz.gita.mmemorygame.data.models.CardData
import uz.gita.mmemorygame.presentation.customViews.CardHolder

fun Fragment.showToast(message: String) {
    Toast.makeText( requireContext(), message, Toast.LENGTH_SHORT).show()
}


fun CardHolder.closeCard(finish: () -> Unit = {  }) {
    this.animate()
        .setDuration(200)
        .rotationY(90f)
        .withEndAction{
            this.apply{
                setImage(R.drawable.question_mark)
                setFieldColor(resources.getColor(R.color.white))
                rotationY = -90f
            }
            this.animate()
                .setDuration(200)
                .rotationY(0f)
                .withEndAction(finish)
                .start()
        }.start()
}

fun CardHolder.openCard(finish: () -> Unit = {  }){
    this.animate()
        .setDuration(200)
        .rotationY(-90f)
        .withEndAction{
            this.apply {
                setImage((this.tag as CardData).image)
                setFieldColor((this.tag as CardData).color)
                rotationY = 90f
            }
            this.animate()
                .setDuration(200)
                .rotationY(0f)
                .withEndAction(finish)
                .start()
        }.start()
}


fun CardHolder.hideCard(finish: () -> Unit){
    this.animate()
        .setDuration(1000)
        .scaleX(0f)
        .scaleY(0f)
        .withEndAction {
            this.visibility = View.GONE
            finish.invoke()
        }
        .start()
}