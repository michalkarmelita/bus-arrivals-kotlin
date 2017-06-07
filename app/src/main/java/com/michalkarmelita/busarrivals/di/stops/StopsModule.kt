package com.michalkarmelita.busarrivals.di.stops

import android.content.Context
import com.michalkarmelita.busarrivals.di.ForActivity
import dagger.Module
import dagger.Provides

@Module
class StopsModule(val context: Context) {

    @Provides
    @ForActivity
    fun provideContext() = context

}