package org.cream.designpatterns

fun main(){

    val myphone = MyexamplesSingleton
    val myphone2 = MyexamplesSingleton

    println("이름 : ${myphone.galaxy}")
    println("이름 : ${myphone2.galaxy}")

    myphone.galaxy = "아이폰"

    println("이름 : ${myphone.galaxy}")
    println("이름 : ${myphone2.galaxy}")

    println("============================")

    var iphone = "아이폰"
    var iphone2 = "아이폰"

    println("이름 : $iphone")
    println("이름 : $iphone2")

    iphone = "갤럭시"

    println("이름 : $iphone")
    println("이름 : $iphone2")

}

class MobilePhone(osName: String, brand: String, model: String){

    init {
        println("나의 폰 기종은 $model 이며 브랜드는 $brand 사용한다 os는 $osName 입니다.")
    }

}