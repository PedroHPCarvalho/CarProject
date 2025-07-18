package com.projectsolid.projectsolid.entity

import jakarta.persistence.*


@Entity
data class Car (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id : Long = 0,

    val brand: String,
    val model: String,
    val year: Int,
    val color: String
)