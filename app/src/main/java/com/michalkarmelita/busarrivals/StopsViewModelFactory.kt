package com.example.michalkarmelita.bustimeskotlin

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.michalkarmelita.busarrivals.App
import com.michalkarmelita.busarrivals.location.LocationLiveData
import javax.inject.Inject

class StopsViewModelFactory @Inject constructor(private val app: App,
                                                private val repository: StopsRepository,
                                                private val locationLiveData: LocationLiveData) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>?): T {
        return StopsViewModel(app, repository, locationLiveData) as T
    }

}
