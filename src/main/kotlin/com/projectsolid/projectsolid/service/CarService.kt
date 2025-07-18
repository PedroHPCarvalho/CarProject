package com.projectsolid.projectsolid.service

import com.projectsolid.projectsolid.entity.Car
import com.projectsolid.projectsolid.repository.CarRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class CarService (private val repository: CarRepository){

    //SELECT ALL
    fun listCars(): List<Car> = repository.findAll()

    //SELECT BY ID
    fun getCarById(id: Long): Car? = repository.findByIdOrNull(id)

    //INSERT (Create New Register)
    fun createCar(car: Car): Car = repository.save(car)

    //UPDATE (Update Existing Register using Put)
    fun updateCar(id: Long, car: Car){
        val existingCar =  getCarById(id)
        if (existingCar != null) {
            val copyCarRegister = car.copy(id = id)
            repository.save(copyCarRegister)
        }
    }

    //DELETE (Delete Existing Register using Delete)
    fun deleteCar(id: Long) = repository.deleteById(id)
}