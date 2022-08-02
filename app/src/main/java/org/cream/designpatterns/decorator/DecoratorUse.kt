package org.cream.designpatterns.decorator

fun main() {

    val service: Service = Development()
    val decorator = Decorator(service)
    val repair = Repair(decorator)

    println(service.runSomething())
    println(decorator.runSomething())
    println(repair.runSomething())

}