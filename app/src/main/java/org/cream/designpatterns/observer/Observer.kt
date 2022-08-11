package org.cream.designpatterns.observer

/*옵저버 패턴
객체의 상태 변화를 관찰하는 것으로
옵저버들의 목록을 객체에 등록하여 상태 변화가 있을 때마다
메서드 등을 통해 객체가 직접 목록의 각 옵저버에게 통지하도록 하는 패턴*/

interface Youtuber{
    fun subscribe(subscriber: Subscriber)
    fun unsubscribe(subscriber: Subscriber)
    fun uploadVideo(title: String)
}

interface Subscriber{
    fun update(msg: String)
}

class YoutuberMan: Youtuber{
    private val subscribers = mutableListOf<Subscriber>()

    override fun subscribe(subscriber: Subscriber){
        subscribers.add(subscriber)
    }
    override fun unsubscribe(subscriber: Subscriber){
        subscribers.remove(subscriber)
    }
    override fun uploadVideo(title: String){
        subscribers.forEach{it.update(title)}
    }
}

class Man: Subscriber{
    override fun update(msg: String){
        println("남자 구독자 수신 : ${msg}")
    }
}

class WoMan: Subscriber{
    override fun update(msg: String){
        println("여자 구독자 수신 : ${msg}")
    }
}


