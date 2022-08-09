package org.cream.designpatterns.template

fun main() {

    val americano = IceAmericano()
    val latte = IceLatte()

    americano.makeCoffee()
    println("=======")
    latte.makeCoffee()

}