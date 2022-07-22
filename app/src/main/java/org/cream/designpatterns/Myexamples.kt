package org.cream.designpatterns

fun main(){

    val myphone = MyexamplesSingleton
    val myphone2 = MyexamplesSingleton

    println("이름 : ${myphone.iphone}")
    println("이름 : ${myphone2.iphone}")

    println(myphone.galaxyS20)
    println(myphone2.galaxyS20)

    println("이름 : ${myphone.Iphone}")
    println("이름 : ${myphone.galaxy}")
}

class MobilePhone(osName: String, brand: String, model: String){

    init {
        println("나의 폰 기종은 $model 이며 브랜드는 $brand 사용한다 os는 $osName 입니다.")
    }


}