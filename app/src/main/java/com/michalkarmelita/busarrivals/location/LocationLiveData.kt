package com.michalkarmelita.busarrivals.location

import android.arch.lifecycle.LiveData
import android.content.Context
import android.location.Location
import android.os.Bundle
import com.google.android.gms.common.ConnectionResult
import com.google.android.gms.common.api.GoogleApiClient
import com.google.android.gms.location.LocationListener
import com.google.android.gms.location.LocationRequest
import com.google.android.gms.location.LocationServices
import com.michalkarmelita.busarrivals.di.ForApplication
import javax.inject.Inject


class LocationLiveData @Inject constructor(@ForApplication context: Context) :
        LiveData<Location>(), GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, LocationListener {

    private val googleApiClient = GoogleApiClient.Builder(context, this, this)
            .addApi(LocationServices.API)
            .build()

    override fun onActive() {
        // Wait for the GoogleApiClient to be connected
        googleApiClient.connect()
    }

    override fun onInactive() {
        if (googleApiClient.isConnected) {
            LocationServices.FusedLocationApi.removeLocationUpdates(
                    googleApiClient, this)
        }
        googleApiClient.disconnect()
    }

    override fun onLocationChanged(location: Location?) {
        // Deliver the location changes
        value = location
    }

    override fun onConnected(connectionHint: Bundle?) {
        // Try to immediately find a location
        val lastLocation = LocationServices.FusedLocationApi
                .getLastLocation(googleApiClient)
        if (lastLocation != null) {
            value = lastLocation
        }
        // Request updates if there’s someone observing
        if (hasActiveObservers()) {
            LocationServices.FusedLocationApi.requestLocationUpdates(
                    googleApiClient, LocationRequest(), this)
        }
    }

    override fun onConnectionFailed(p0: ConnectionResult) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onConnectionSuspended(p0: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

