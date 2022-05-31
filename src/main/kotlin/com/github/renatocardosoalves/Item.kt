package com.github.renatocardosoalves

abstract class Item(
    private val category: String,
    open val description: String,
    open val price: Double
)