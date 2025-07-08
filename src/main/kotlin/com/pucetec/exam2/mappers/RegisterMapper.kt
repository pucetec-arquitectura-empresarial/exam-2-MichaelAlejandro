package com.pucetec.exam2.mappers

import com.pucetec.exam2.models.entities.Register
import com.pucetec.exam2.models.responses.RegisterResponse


class RegisterMapper {
    fun toResponse(register: Register): RegisterResponse{
        return RegisterResponse(
            tickedId = register.tickedId,
            assignedFloor = register.assignedFloor,
            entryTime = register.entryTime,
            exitTime = register.exitTime
        )
    }
}