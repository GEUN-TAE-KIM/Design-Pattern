package org.cream.designpatterns.proxy

fun main() {

    //프록시 x
    val normalFile: File = NormalFile()
    normalFile.read("readme.md")

    //프록시
    val proxyFile = ProxyFile()
    proxyFile.read("readme.md")

    proxyFile.password = "비밀"
    proxyFile.read("readme.md")
}