package com.github.renatocardosoalves
import kotlinx.datetime.LocalDate
import kotlinx.datetime.Month

class Cigar(
    description: String,
    price: Double
) : TaxItem(
    category = "Cigar",
    description,
    price
) {
    override fun getTax(date: LocalDate): Double {
        return if (date.month == Month.JANUARY) 0.1 else 0.2
    }
}