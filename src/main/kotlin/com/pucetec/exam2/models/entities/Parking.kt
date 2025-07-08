package com.pucetec.exam2.models.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
class Parking {

    @Id
    var id

    @Column
    var number
}