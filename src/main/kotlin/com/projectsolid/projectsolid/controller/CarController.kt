package com.projectsolid.projectsolid.controller


import com.projectsolid.projectsolid.entity.Car
import com.projectsolid.projectsolid.service.CarService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/cars")
class CarController (private val service: CarService){

    @GetMapping
    fun listar() = service.listCars()

    @GetMapping("/{id}")
    fun getCarWithId(@PathVariable id: Long) = service.getCarById(id)

    @PostMapping
    fun createNewCarRegister(@RequestBody car: Car) = service.createCar(car)

    @PutMapping("/{id}")
    fun updateCarRegister(@PathVariable id: Long, @RequestBody car: Car) = service.updateCar(id,car)

    @DeleteMapping("/{id}")
    fun  deleteCarRegister(@PathVariable id: Long) = service.deleteCar(id)
}