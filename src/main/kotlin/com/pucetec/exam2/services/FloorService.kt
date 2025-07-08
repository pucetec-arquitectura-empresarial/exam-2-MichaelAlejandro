package com.pucetec.exam2.services

import com.pucetec.exam2.mappers.FloorMapper
import com.pucetec.exam2.models.entities.Floor
import com.pucetec.exam2.models.requests.FloorCreateRequest
import com.pucetec.exam2.models.responses.FloorResponse
import com.pucetec.exam2.repositories.FloorRepository
import org.springframework.stereotype.Service

@Service
class FloorService (
    private val floorRepository: FloorRepository,
    private val floorMapper: FloorMapper
 ){
    fun createFloor(request: FloorCreateRequest): FloorResponse{
        val floor = floorRepository.save(
            Floor(
                uid = request.uid,
                level = request.level,
                totalCapacity = request.totalCapacity,
                occupiedSpots = request.occupiedSpots
            )
        )
        return floorMapper.toResponse(floor)
    }
}
