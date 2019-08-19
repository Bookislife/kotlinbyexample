package com.bookislife.kotlinbyexample._11_class

/**
 * 实例20：定义一个电脑类
 */
class Computer {

    // 属性
    var cpus = 2
    var hardDisk = 1024

    // 方法
    fun running(): Unit {
        println("电脑运行中。。。")
    }

    fun turnOn() {
        println("启动电脑")
    }

    fun shutDown() {
        println("关闭电脑")
    }

    fun add(x: Int, y: Int): Int {
        return x + y
    }
}