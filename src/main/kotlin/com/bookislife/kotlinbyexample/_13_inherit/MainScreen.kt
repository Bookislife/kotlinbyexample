package com.bookislife.kotlinbyexample._13_inherit

/**
 * 第一个屏幕类
 */
class MainScreen(width:Int, height:Int): Screen(width, height) {

    override fun onCreate() {
        val button = Button("click", 200, 30)
        addChild(button)
        println("向屏幕中添加按钮")
    }
}