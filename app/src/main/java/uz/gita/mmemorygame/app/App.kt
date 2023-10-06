package uz.gita.mmemorygame.app

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.view.WindowCompat
import uz.gita.mmemorygame.data.source.shared.Shared
import uz.gita.mmemorygame.domain.Repository

class App : Application() {
    companion object{
        lateinit var instance: App
            private set
    }

    override fun onCreate() {
        super.onCreate()

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        instance = this
        Shared.init()
        Repository.init()
    }
}