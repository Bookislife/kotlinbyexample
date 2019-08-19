package com.bookislife.kotlinbyexample._11_class

/**
 * 11.5  对象的概念与使用
 */
class Human {
    var age: Int = 0
    fun growUp() {
        age++
    }
}

fun main(args: Array<String>) {
    val you = Human()
    val me = Human()
    you.growUp()
    you.growUp()
    me.growUp()
    println("you 年龄是：${you.age}")
    println("me 年龄是：${me.age}")
}