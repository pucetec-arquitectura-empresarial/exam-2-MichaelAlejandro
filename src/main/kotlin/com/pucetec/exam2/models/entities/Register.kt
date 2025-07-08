package com.pucetec.exam2.models.entities

import jakarta.persistence.Entity
import jakarta.persistence.Table
import java.time.LocalDateTime

@Entity
@Table(name = "registers")
data class Register (
    val tickedId: String,
    var assignedFloor: Int,
    var entryTime: LocalDateTime,
    var exitTime: LocalDateTime
)

