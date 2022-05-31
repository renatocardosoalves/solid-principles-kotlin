package com.github.renatocardosoalves

import kotlinx.datetime.LocalDate

class Order(
    private var items: List<Item> = mutableListOf()
) {
    fun getSubtotal(): Double {
        return this.items.sumOf { it.price }
    }

    fun getTaxes(date: LocalDate): Double {
        return this.items.sumOf {
            if (it is TaxItem) it.calculateTaxes(date) else 0.0
        }
    }

    fun getTotal(date: LocalDate): Double {
        return this.getSubtotal() + this.getTaxes(date)
    }

    fun addItem(item: Item) {
        this.items += item
    }
}