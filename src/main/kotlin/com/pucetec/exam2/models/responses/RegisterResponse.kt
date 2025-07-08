package com.pucetec.exam2.models.responses

import java.time.LocalDateTime

data class RegisterResponse(
    val tickedId: String,
    var assignedFloor: Int,
    var entryTime: LocalDateTime,
    var exitTime: LocalDateTime
)