package com.bookislife.kotlinbyexample._13_inherit

/**
 * 按钮类
 */
class Button(val text: String, width: Int, height: Int) :
        View(width, height) {
    override fun onDraw() {
        println("绘制按钮[$text]")
    }
}


