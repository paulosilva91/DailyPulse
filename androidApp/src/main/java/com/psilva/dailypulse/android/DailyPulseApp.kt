package com.psilva.dailypulse.android

import android.app.Application
import com.psilva.dailypulse.android.di.databaseModule
import com.psilva.dailypulse.android.di.viewModelsModule
import com.psilva.dailypulse.di.sharedKoinModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class DailyPulseApp: Application() {
    override fun onCreate() {
        super.onCreate()

        initKoin()
    }

    private fun initKoin() {
        val modules = sharedKoinModules + viewModelsModule + databaseModule

        startKoin {
            androidContext(this@DailyPulseApp)
            modules(modules)
        }
    }
}