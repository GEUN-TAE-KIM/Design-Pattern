package org.cream.designpatterns.composite

/*컴포지트 패턴
  하나 또는 하나 이상의 객체를 동일하게 취급하여 사용 하는 것*/

open class Fruit(private var price: Int, private var name: String) {
    open fun getPrice(): Int = price
}


// 컴포지트 패턴
open class Composite(name: String) : Fruit(0, name) {
    val fruits = ArrayList<Fruit>()

    fun add(fruit: Fruit) {
        this.fruits.add(fruit);
    }

    fun remove(fruit: Fruit) {
        this.fruits.remove(fruit);
    }

    override fun getPrice(): Int {
        return fruits.map { it -> it.getPrice() }.sum()
    }
}

// 객체들
class Basket : Composite("바구니")
class Apple : Fruit(1000, "사과")
class Banana : Fruit(350, "바나나")
class Orange : Fruit(2000, "오렌지")

