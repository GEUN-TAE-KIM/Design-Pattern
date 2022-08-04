package org.cream.designpatterns.proxy

/*프록시 패턴
기능을 수행하는 진짜 객체 대신 가상의 객체를 만들어 사용하는 패턴*/

interface File {
    fun read(name: String)
}

class NormalFile : File {
    override fun read(name: String) = println("파일 읽는 중: $name")
}

// 프록시 클래스
class ProxyFile : File {
    val normalFile = NormalFile()
    var password: String = ""

    override fun read(name: String) {
        if (password == "비밀") {
            println("번호가 정확함: $password")
            normalFile.read(name)
        }else {
            println("잘못된 번호 접근이 불가")
        }
    }
}
