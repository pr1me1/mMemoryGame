package uz.gita.mmemorygame.data.models

import java.io.Serializable

data class CardData(
    val id: Int,
    val image: Int,
    val color: Int,
    val category: String,
    val info: String
): Serializable