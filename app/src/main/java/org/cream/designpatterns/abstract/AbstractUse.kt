package org.cream.designpatterns.abstract

fun main() {

    val phoneFactory = PhoneFactory.createFactory<GalaxyPhone>()
    val phone = phoneFactory.makePhone()

    println("폰 내용: $phone")
}