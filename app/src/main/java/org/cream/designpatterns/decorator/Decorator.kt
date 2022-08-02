package org.cream.designpatterns.decorator

/*데코레이터 패턴
객체를 데코레이터 클래스의 객체로 감싸서 런타임 떄 객체의 기능을
확장하거나 변경하는데 사용*/

interface Service {
    fun runSomething(): String
}

class Development : Service {
    override fun runSomething(): String = "개발"
}

//데코레이터
class Decorator : Service {
    lateinit var service: Service

    override fun runSomething(): String
            = "디자인 + " + service.runSomething()
}