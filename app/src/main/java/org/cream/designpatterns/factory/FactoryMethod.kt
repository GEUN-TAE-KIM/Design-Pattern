package org.cream.designpatterns.factory

interface Phone {

    val code: String

}
// 객체 생성 정의
class GalaxyPhone(override val code: String = "Galaxy") : Phone
class IphonePhone(override val code: String = "Iphone") : Phone

enum class PhoneType {
    Android, Ios
}
// 생성
class Order {
    fun order(phone: PhoneType): Phone {

        return when (phone) {
            PhoneType.Android -> GalaxyPhone()
            PhoneType.Ios -> IphonePhone()
        }

    }
}