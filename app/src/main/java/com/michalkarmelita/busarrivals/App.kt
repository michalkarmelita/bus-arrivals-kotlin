package com.michalkarmelita.busarrivals

import android.app.Application
import com.michalkarmelita.busarrivals.di.AppComponent
import com.michalkarmelita.busarrivals.di.AppModule
import com.michalkarmelita.busarrivals.di.DaggerAppComponent

class App : Application() {

    companion object {
        lateinit var component: AppComponent
    }

    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent
                .builder()
                .appModule(AppModule(this))
                .build()
        component.inject(this)
    }
}