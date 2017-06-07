package com.michalkarmelita.busarrivals.di

import com.michalkarmelita.busarrivals.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(val app: App) {

    @Provides
    @Singleton
    fun provideApp() = app

    @Provides
    @Singleton
    @ForApplication
    fun privideApplicationContext() = app.applicationContext
}