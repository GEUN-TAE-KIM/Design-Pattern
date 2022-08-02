package org.cream.designpatterns.composite

fun main() {

    var basket = Basket()
    basket.add(Apple())
    basket.add(Banana())
    basket.remove(Orange())

    println(basket.getPrice())

}