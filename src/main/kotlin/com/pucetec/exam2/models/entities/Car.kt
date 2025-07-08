package com.pucetec.exam2.models.entities

import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "Car")
data class Car (
    val name: String,

)
