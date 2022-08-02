package org.cream.designpatterns.decorator

fun main() {

    val service: Service = Development()
    val decorator = Decorator()
    decorator.service = service

    println(service.runSomething())
    println(decorator.runSomething())

}