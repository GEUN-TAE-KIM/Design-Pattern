package org.cream.designpatterns.observer

fun main(){
    val youtuber = YoutuberMan()
    val man = Man()
    val woMan = WoMan()

    youtuber.subscribe(man)
    youtuber.subscribe(woMan)

    youtuber.uploadVideo("라면 먹방")

    youtuber.unsubscribe(man)
    println("========================")
    youtuber.uploadVideo("햄버거 먹방")
}
