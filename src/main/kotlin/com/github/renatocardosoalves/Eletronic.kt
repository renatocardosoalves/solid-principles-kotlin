package com.github.renatocardosoalves

import kotlinx.datetime.LocalDate

class Eletronic(
    description: String,
    price: Double
) : TaxItem(
    category = "Eletronic",
    description,
    price
) {
    override fun getTax(date: LocalDate): Double {
        return 0.5
    }
}