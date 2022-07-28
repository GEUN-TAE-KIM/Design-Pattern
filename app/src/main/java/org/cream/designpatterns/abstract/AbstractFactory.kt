package org.cream.designpatterns.abstract

import java.lang.IllegalArgumentException

interface Phone

class GalaxyPhone : Phone
class IphonePhone : Phone

abstract class PhoneFactory {
    abstract fun makePhone(): Phone

    companion object {
        //inline 함수와 reified 키워드를 함께 사용하면 T type에 대해서 접근할 수 있게 해줌
        //함수의 인자로 "타입"을 전달하고 싶고 또 이 함수 내부에서 클래스 내부의 private 정보에 접근하고 싶을 때
        inline fun <reified T : Phone> createFactory(): PhoneFactory = when (T::class) {

            GalaxyPhone::class -> GalaxyFactory()
            IphonePhone::class  -> IphoneFactory()
            else -> throw IllegalArgumentException()

        }
    }
}

class GalaxyFactory : PhoneFactory() {
    override fun makePhone(): Phone = GalaxyPhone()
}

class IphoneFactory : PhoneFactory() {
    override fun makePhone(): Phone = IphonePhone()
}