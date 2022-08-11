package org.cream.designpatterns.iterator

fun main() {
    val cars = Cars(listOf(Car("람보르기니"), Car("페라리")))
    val iterator = cars.iterator()

    // 데이터를 모두 가져올때까지 반복하고 출력
    while (iterator.hasNext()) {
        println("brand : ${iterator.next()}")
    }
}