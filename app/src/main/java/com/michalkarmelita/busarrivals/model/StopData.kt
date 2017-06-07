package com.michalkarmelita.busarrivals.model

data class StopData(val id: String,
                    val lat: Double,
                    val lon: Double,
                    val indicator: String,
                    val stopLetter: String,
                    val commonName: String,
                    val lines: Set<Int>)