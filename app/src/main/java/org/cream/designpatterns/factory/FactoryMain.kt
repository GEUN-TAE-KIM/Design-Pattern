package org.cream.designpatterns.factory

fun main() {

    val galaxy = Order().order(PhoneType.Android).code
    println("해당 폰 : $galaxy")

    val iphone = Order().order(PhoneType.Ios).code
    println("해당 폰 : $iphone")

}