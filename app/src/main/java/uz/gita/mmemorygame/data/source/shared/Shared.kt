package uz.gita.mmemorygame.data.source.shared

import android.content.Context
import uz.gita.mmemorygame.app.App
import uz.gita.mmemorygame.data.enums.DifficultyEnum

class Shared private constructor() {

    companion object{
        private lateinit var instence: Shared

        fun init() {
            if (!::instence.isInitialized) {
                instence  = Shared()
            }
        }

        fun getInstance()= instence
    }

    private val mPref = App.instance.getSharedPreferences("mShared", Context.MODE_PRIVATE)

    fun saveDifficulty(difficulty: DifficultyEnum) {
        mPref.edit().putString("difficulty", difficulty.name).apply()
    }


    fun getDifficulty(): DifficultyEnum {
        return when (mPref.getString("difficulty", "")) {
            "Easy" -> DifficultyEnum.Easy
            "Medium" -> DifficultyEnum.Medium
            else -> DifficultyEnum.Hard
        }
    }


    fun getVolumeState(): Boolean = mPref.getBoolean("VOLUME_STATE", true)

    fun muteVolume() = mPref.edit().putBoolean("VOLUME_STATE", false).apply()

    fun unmuteVolume() = mPref.edit().putBoolean("VOLUME_STATE", true).apply()

}