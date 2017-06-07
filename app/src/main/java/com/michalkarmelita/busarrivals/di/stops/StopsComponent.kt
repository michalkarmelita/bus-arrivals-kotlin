package com.michalkarmelita.busarrivals.di.stops

import com.example.michalkarmelita.bustimeskotlin.StopsActivity
import com.michalkarmelita.busarrivals.di.ForActivity
import dagger.Subcomponent

@ForActivity
@Subcomponent(
        modules = arrayOf(StopsModule::class)
)
interface StopsComponent {
    fun inject(stopsActivity: StopsActivity)
}