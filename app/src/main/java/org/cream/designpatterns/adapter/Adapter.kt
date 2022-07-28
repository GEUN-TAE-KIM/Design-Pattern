package org.cream.designpatterns.adapter


interface Driver {
    fun findAll()
}

class OracleDriver : Driver {
    private val name = "OracleSQL"

    override fun findAll() {
        println("$name - 모두 찾기")
    }
}

class Api(private val driver: Driver) {
    fun findAll() {
        driver.findAll()
    }
}

fun main() {
    var api = Api(OracleDriver())
    api.findAll()
}