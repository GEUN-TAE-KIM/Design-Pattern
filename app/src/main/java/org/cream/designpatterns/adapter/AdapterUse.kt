package org.cream.designpatterns.adapter


// 외부 라이브러리 라면
class Firebase {
    fun findAll() {
        println("Firebase - Find all")
    }
}

// 어댑터 패턴
class FirebaseAdapter : Driver {
    val driver = Firebase()

    override fun findAll() {
        driver.findAll()
    }
}

fun main() {
    var api = Api(OracleDriver())
    api.findAll()

    api = Api(FirebaseAdapter())
    api.findAll()
}