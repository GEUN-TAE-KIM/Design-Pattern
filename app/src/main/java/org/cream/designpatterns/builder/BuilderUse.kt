package org.cream.designpatterns.builder

fun main() {
    val lol = Lol.Builder()
        .setTier("다이아")
        .build()
    lol.printInfo()
    
    val lol2 = Lol.Builder()
         .setTier("브론즈")
        .build()
    lol2.printInfo()

}