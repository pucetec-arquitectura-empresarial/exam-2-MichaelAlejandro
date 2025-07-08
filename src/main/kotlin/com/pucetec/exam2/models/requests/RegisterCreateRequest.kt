package com.pucetec.exam2.models.requests

import java.time.LocalDateTime

data class RegisterCreateRequest (
    val tickedId: String,
    var assignedFloor: Int,
    var entryTime: LocalDateTime,
    var exitTime: LocalDateTime
)