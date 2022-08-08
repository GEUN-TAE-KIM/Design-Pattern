package org.cream.designpatterns.strategy

fun main() {

    val knife = Knife()
    val gun = Gun()

    val man = Character()

    man.setWeapon(knife)
    man.attack()

    man.setWeapon(gun)
    man.attack()

}