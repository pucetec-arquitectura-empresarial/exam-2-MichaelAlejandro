package com.pucetec.exam2.models.entities

import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "floor")
data class Floor(
    val uid: String,
    var level: Int,
    var totalCapacity: Int,
    var occupiedSpots: Int
)



