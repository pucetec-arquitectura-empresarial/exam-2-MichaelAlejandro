package com.pucetec.exam2.models.responses


data class FloorResponse(
    val uid: String,
    var level: Int,
    var totalCapacity: Int,
    var occupiedSpots: Int
)
