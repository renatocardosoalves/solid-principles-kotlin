package com.github.renatocardosoalves

import kotlinx.datetime.LocalDate

abstract class TaxItem(
    category: String,
    description: String,
    price: Double
): Item(
    category,
    description,
    price
) {
    abstract fun getTax(date: LocalDate): Double

    fun calculateTaxes(date: LocalDate): Double {
        return this.price * this.getTax(date)
    }
}