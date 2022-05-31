package com.github.renatocardosoalves

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec
import kotlinx.datetime.toLocalDate

class OrderTest : ShouldSpec({
    should(name = "calculate order subtotal") {
        val order = Order()
        order.addItem(Cigar(description = "Marlboro", price = 10.0))
        order.addItem(Beer(description = "Itaipava", price = 5.0))
        order.addItem(Water(description = "Crystal", price = 2.0))
        order.addItem(Eletronic(description = "iPhone", price = 5000.0))
        order.getSubtotal() shouldBe 5017.0
    }

    should(name = "calculate order taxes") {
        val order = Order()
        order.addItem(Cigar(description = "Marlboro", price = 10.0))
        order.addItem(Beer(description = "Itaipava", price = 5.0))
        order.addItem(Water(description = "Crystal", price = 2.0))
        order.addItem(Eletronic(description = "iPhone", price = 5000.0))
        order.getTaxes("2022-06-09".toLocalDate()) shouldBe 2502.5
    }

    should(name = "calculate order holiday taxes") {
        val order = Order()
        order.addItem(Cigar(description = "Marlboro", price = 10.0))
        order.addItem(Beer(description = "Itaipava", price = 5.0))
        order.addItem(Water(description = "Crystal", price = 2.0))
        order.addItem(Eletronic(description = "iPhone", price = 5000.0))
        order.getTaxes("2022-01-09".toLocalDate()) shouldBe 2501.5
    }

    should(name = "calculate order total") {
        val order = Order()
        order.addItem(Cigar(description = "Marlboro", price = 10.0))
        order.addItem(Beer(description = "Itaipava", price = 5.0))
        order.addItem(Water(description = "Crystal", price = 2.0))
        order.addItem(Eletronic(description = "iPhone", price = 5000.0))
        order.getTotal("2022-06-09".toLocalDate()) shouldBe 7519.5
    }
})