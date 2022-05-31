package com.github.renatocardosoalves

import kotlinx.datetime.LocalDate

class Beer(
    description: String,
    price: Double
) : TaxItem(
    category = "Beer",
    description,
    price
) {
    override fun getTax(date: LocalDate): Double {
        return 0.1
    }
}