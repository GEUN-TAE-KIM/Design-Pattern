package org.cream.designpatterns.command

/*
커맨드패턴
객체에서 수행될 호출과 필요한 모든 매개 변수를 포함하여 요청을 표현하는데 사용
명령은 즉시 실행되거나 나중에 사용 되도록 유지 가능*/

//Command
interface OrderCommand {
    fun execute()
}

class OrderAddCommand(val id: Int) : OrderCommand {
    override fun execute() = println("ID로 주문 추가: $id")
}

class OrderPayCommand(val id: Int) : OrderCommand {
    override fun execute() = println("ID로 주문 결제: $id")
}

// 프로퍼티에 함수를 통해 명령을 넣거나 사용
class CommandProcessor {

    private val queue = ArrayList<OrderCommand>()

    fun addToQueue(orderCommand: OrderCommand): CommandProcessor =
        //자기 자신 반환
        apply {
            queue.add(orderCommand)
        }

    fun processCommands(): CommandProcessor =
        apply {
            queue.forEach { it.execute() }
            queue.clear()
        }
}

