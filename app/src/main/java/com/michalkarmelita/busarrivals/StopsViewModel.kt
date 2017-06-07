package com.example.michalkarmelita.bustimeskotlin

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import com.michalkarmelita.busarrivals.location.LocationLiveData

class StopsViewModel constructor(app : Application, repository : StopsRepository,
                                 locationLiveData: LocationLiveData) : AndroidViewModel(app) {


}



