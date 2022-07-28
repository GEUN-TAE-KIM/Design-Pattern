package org.cream.designpatterns

import org.cream.designpatterns.singleton.MyexamplesSingleton

fun main(){

    val myphone = MyexamplesSingleton
    val myphone2 = MyexamplesSingleton

    println("이름 : ${myphone.galaxy}")
    println("이름 : ${myphone2.galaxy}")
    
    // 싱글톤의 변수를 변경하는 것이기 때문에 다 바뀜
    myphone.galaxy = "아이폰"

    println("이름 : ${myphone.galaxy}")
    println("이름 : ${myphone2.galaxy}")

    println("============================")
    println("일반적인 변경")

    var iphone = "아이폰"
    var iphone2 = "아이폰"

    println("이름 : $iphone")
    println("이름 : $iphone2")

    iphone = "갤럭시"

    println("이름 : $iphone")
    println("이름 : $iphone2")

}