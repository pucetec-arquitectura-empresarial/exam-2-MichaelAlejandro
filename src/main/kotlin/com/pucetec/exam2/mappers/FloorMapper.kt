package com.pucetec.exam2.mappers

import org.springframework.stereotype.Component
import com.pucetec.exam2.models.entities.Floor
import com.pucetec.exam2.models.responses.FloorResponse

@Component
class FloorMapper {
    fun toResponse(floor: Floor): FloorResponse{
        return FloorResponse(
            uid = floor.uid,
            level = floor.level,
            totalCapacity = floor.totalCapacity,
            occupiedSpots = floor.occupiedSpots
        )
    }
}