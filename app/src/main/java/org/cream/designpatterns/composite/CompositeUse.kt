package org.cream.designpatterns.composite

fun main() {

    var basket = Basket()
    basket.add(Apple())
    basket.add(Banana())
    basket.remove(Orange())

    println(basket.getPrice())

    var basket2 = basket
    basket2.add(Apple())
    basket2.add(Banana())
    basket2.remove(Orange())

    println(basket2.getPrice())

    var basket3 = basket2
    basket3.add(Apple())
    basket3.add(Banana())
    basket3.remove(Orange())

    println(basket3.getPrice())

}