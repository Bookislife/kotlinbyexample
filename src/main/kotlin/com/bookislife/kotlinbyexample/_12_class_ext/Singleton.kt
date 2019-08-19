package com.bookislife.kotlinbyexample._12_class_ext

/**
 * 12.3  对象声明——单例对象
 */
// 单例对象
object Singleton {
    // 单例对象的属性
    private var num = 0

    fun sequence(): Int {
        num += 1
        return num
    }

}

fun main(args: Array<String>) {
    // Singleton在这里获得的就是单例对象的唯一一个实例
    assert(1 == Singleton.sequence())
    assert(2 == Singleton.sequence())
    assert(3 == Singleton.sequence())
}