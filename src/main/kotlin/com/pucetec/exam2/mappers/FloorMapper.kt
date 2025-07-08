package com.pucetec.exam2.mappers

import org.springframework.stereotype.Component
import com.pucetec.exam2.models.entities.Floor
import com.pucetec.exam2.models.requests.FloorCreateRequest
import com.pucetec.exam2.models.responses.FloorResponse

@Component
class FloorMapper {
    fun toResponse(floor: Floor): FloorResponse{
        return FloorResponse(
            val uid = floor.uid,
            var level = floor.level,
            var totalCapacity = floor.totalCapacity,
            var occupiedSpots = floor.occupiedSpots
        )
    }
}