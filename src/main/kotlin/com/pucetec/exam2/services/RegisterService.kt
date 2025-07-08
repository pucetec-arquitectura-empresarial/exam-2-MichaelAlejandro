package com.pucetec.exam2.services

import com.pucetec.exam2.mappers.RegisterMapper
import com.pucetec.exam2.models.entities.Register
import com.pucetec.exam2.models.requests.RegisterCreateRequest
import com.pucetec.exam2.models.responses.RegisterResponse
import com.pucetec.exam2.repositories.RegisterRepository
import org.springframework.stereotype.Service

@Service
class RegisterService (
    private val registerRepository: RegisterRepository,
    private val registerMapper: RegisterMapper
){
    fun createRegister(request: RegisterCreateRequest): RegisterResponse{
        val register = registerRepository.save(
            Register(
                tickedId = request.tickedId,
                assignedFloor = request.assignedFloor,
                entryTime = request.entryTime,
                exitTime = request.exitTime
            )
        )
        return registerMapper.toResponse(register)

    }
}


