package org.cream.designpatterns.builder

fun main() {
    val lol = Lol.Builder()
        .setName("페이커")
        .setTier("챌린저")
        .setTierNum(1)
        .setPosition("미드")
        .build()
    lol.printInfo()
    
    val lol2 = Lol.Builder()
         .setTier("브론즈")
        .build()
    lol2.printInfo()

}