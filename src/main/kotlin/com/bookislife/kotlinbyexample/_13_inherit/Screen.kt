package com.bookislife.kotlinbyexample._13_inherit

/**
 * 屏幕抽象类
 */
abstract class Screen(width: Int, height: Int) : ViewGroup(width, height) {

    abstract fun onCreate()

    override fun drawSelf() {
        println("绘制屏幕")
    }
}