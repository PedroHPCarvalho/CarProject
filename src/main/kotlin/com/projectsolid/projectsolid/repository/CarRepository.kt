package com.projectsolid.projectsolid.repository

import com.projectsolid.projectsolid.entity.Car
import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional

interface CarRepository: JpaRepository<Car, Long> {
    fun findByModel(model: String): Optional<Car>
}
