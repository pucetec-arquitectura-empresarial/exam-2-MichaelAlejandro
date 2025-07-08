package com.pucetec.exam2.models.requests

data class FloorCreateRequest (
    val uid: String,
    var level: Int,
    var totalCapacity: Int,
    var occupiedSpots: Int
)