package com.bookislife.kotlinbyexample._13_inherit

/**
 * 文本框类
 */
class TextView(val text: String, width: Int, height: Int) :
        View(width, height) {
    override fun onDraw() {
        println("绘制文本框[$text]")
    }
}


