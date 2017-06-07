package com.michalkarmelita.busarrivals.repository;

import android.arch.lifecycle.LiveData;

import com.michalkarmelita.busarrivals.model.StopData;

import java.util.List;

public interface StopsRepository {

    LiveData<List<StopData>> getStops(double latitude, double longitude);
}
