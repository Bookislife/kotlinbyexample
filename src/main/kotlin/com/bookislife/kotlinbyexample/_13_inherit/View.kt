package com.bookislife.kotlinbyexample._13_inherit

/**
 * 表示视图的类
 */
abstract class View(val width: Int, val height: Int) : Drawable {

    open fun isClickable(): Boolean {
        return true
    }
}