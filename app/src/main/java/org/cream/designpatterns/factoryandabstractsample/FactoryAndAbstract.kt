package org.cream.designpatterns.factoryandabstractsample

import org.cream.designpatterns.factory.Order
import org.cream.designpatterns.factory.PhoneType

// 기존 생성자 클래스
class Phone(firstName: String, lastname: String) {
    val iphone = "$firstName $lastname"
    val galaxy = "$firstName $lastname"
}

fun main() {
    val apple = Phone("apple", "아이폰")
    val samsung = Phone("samsung", "갤럭시")

    println(apple.iphone)
    println(samsung.galaxy)

    println("================================================")
    // 팩토리 메소드
    val galaxy = Order().order(PhoneType.Android).code
    println("해당 폰 : $galaxy")
    val iphone = Order().order(PhoneType.Ios).code
    println("해당 폰 : $iphone")



}