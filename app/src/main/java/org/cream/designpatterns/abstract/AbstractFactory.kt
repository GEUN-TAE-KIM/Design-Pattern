package org.cream.designpatterns.abstract

import java.lang.IllegalArgumentException

interface Phone

class GalaxyPhone : Phone
class IphonePhone : Phone

abstract class PhoneFactory {
    abstract fun makePhone(): Phone

    companion object {
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