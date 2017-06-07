package com.michalkarmelita.busarrivals.repository;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.Transformations;


import com.michalkarmelita.busarrivals.model.StopData;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import javax.inject.Inject;

public class StopsRepositoryImpl implements StopsRepository {

    private static final int RADIUS = 1000;
    private static final String STOP_TYPE = "NaptanBusCoachStation,NaptanBusWayPoint,NaptanCoachAccessArea," +
                                            "NaptanCoachBay,NaptanCoachEntrance,NaptanCoachServiceCoverage,NaptanCoachVariableBay," +
                                            "NaptanOnstreetBusCoachStopCluster,NaptanOnstreetBusCoachStopPair,NaptanPrivateBusCoachTram," +
                                            "NaptanPublicBusCoachTram";

//    private final TflApi apiService;
//
//    @Inject
//    public StopsRepositoryImpl(TflApi apiService) {
//        this.apiService = apiService;
//    }
//
//    @Override
//    public LiveData<List<StopData>> getStops(double latitude, double longitude) {
//        return Transformations.map(apiService.getStopPoints(latitude, longitude, STOP_TYPE, RADIUS), new Function<ApiResponse<StopsResponse>, List<StopData>>() {
//            @Override
//            public List<StopData> apply(ApiResponse<StopsResponse> input) {
//                List<StopData> stops = new ArrayList<>();
//                for (StopPoint child : input.body.getStopPoints()) {
//                    stops.add(new StopData(child.getId(), child.getLat(), child.getLon(), child.getIndicator(), child.getStopLetter(), format(child.getCommonName()), new HashSet<Integer>()));
//                }
//                return stops;
//            }
//        });
//    }

    private String format(String name) {
        //// TODO remove spaces around " / " in name
        return name;
    }

    @Override
    public LiveData<List<StopData>> getStops(double latitude, double longitude) {
        return null;
    }
}
