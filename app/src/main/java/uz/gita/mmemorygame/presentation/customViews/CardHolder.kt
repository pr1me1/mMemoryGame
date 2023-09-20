package uz.gita.mmemorygame.presentation.customViews

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.util.AttributeSet
import android.view.View
import androidx.annotation.ColorInt
import androidx.annotation.DrawableRes
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.graphics.drawable.toDrawable
import uz.gita.mmemorygame.R
import uz.gita.mmemorygame.app.App

class CardHolder @JvmOverloads constructor(
    context: Context,
    attr: AttributeSet? = null,
    defStyle: Int = 0
) : View(context, attr, defStyle) {
    @ColorInt
    private var borderColor = Color.BLACK

    @ColorInt
    private var fieldColor = Color.YELLOW

    @DrawableRes
    private var image = R.drawable.question_mark


    init {
        val typeArray = context.theme.obtainStyledAttributes(attr, R.styleable.CardHolder, defStyle, 0)

        try {
            borderColor = typeArray.getColor(R.styleable.CardHolder_borderColor, borderColor)
            fieldColor = typeArray.getColor(R.styleable.CardHolder_fieldColor, fieldColor)
        } catch (_: Exception) {

        }finally {
            typeArray.recycle()
        }
    }

    fun setFieldColor(@ColorInt color: Int) {
        fieldColor = color
        invalidate()
    }

    fun setImage(@DrawableRes image: Int) {
        this.image = image

        invalidate()
    }

    companion object{
        private const val BORDER_WIDTH = 12f
    }


    private var paintBorder = Paint().apply {
        isAntiAlias = true
        style = Paint.Style.STROKE
        strokeWidth = BORDER_WIDTH
        color = borderColor

    }



    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        setMeasuredDimension(widthMeasureSpec, widthMeasureSpec)
    }


    override fun onDraw(canvas: Canvas) {
//        renderBorder(canvas)
        renderField(canvas)
        renderImage(canvas)
    }


    private fun renderBorder(canvas: Canvas){
        canvas.drawRoundRect(0f, 0f, width*1f, height*1f, 70f, 70f,paintBorder )
    }


    private fun renderField(canvas: Canvas) {
//        canvas.drawColor(fieldColor)
        var paintField:Paint = Paint().apply {
            isAntiAlias = true
            style = Paint.Style.FILL
            color = fieldColor
        }


        canvas.drawRoundRect(0f, 0f, width*1f, height*1f, 50f, 50f,paintField )
    }

    private fun renderImage(canvas: Canvas) {
        val drawable = AppCompatResources.getDrawable(context, image)

        drawable?.bounds = Rect(20 , 20, width - 20 , height - 20)
        drawable?.draw(canvas)

    }


}