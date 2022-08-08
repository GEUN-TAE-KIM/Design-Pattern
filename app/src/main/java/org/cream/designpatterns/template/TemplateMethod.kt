package org.cream.designpatterns.template

/*
템플릿 메소드 패턴
전체적으로는 동일하면서 부분적으로는
다른 구문으로 구성된 메서드의 코드 중복을 최소화 할 때 사용*/

abstract class Coffee {
    fun makeCoffee() {
        putEspresso()
        putIce()
        putExtra()
    }

    private fun putEspresso() {
        println("에스프레소를 넣는다.")
    }

    private fun putIce() {
        println("얼음을 넣는다.")
    }

    // 확장 / 변경
    open fun putExtra() {
        return
    }
}

class IceAmericano : Coffee() {
    override fun putExtra() {
        println("끓는 물을 넣는다.")
    }
}

class IceLatte : Coffee() {
    override fun putExtra() {
        println("끓는 우유를 넣는다.")
    }
}


