package uz.softonic.eexpert

import android.app.Application
import org.koin.android.ext.koin.androidContext
import uz.softonic.eexpert.di.initKoin

class EExpertApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@EExpertApplication)
        }
    }
}
