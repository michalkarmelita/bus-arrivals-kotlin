package com.michalkarmelita.busarrivals.di

import com.michalkarmelita.busarrivals.App
import com.michalkarmelita.busarrivals.di.stops.StopsComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun inject(app: App)

    fun plus(): StopsComponent

}