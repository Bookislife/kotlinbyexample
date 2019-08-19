package com.bookislife.kotlinbyexample._13_inherit

/**
 * 手机类
 */
class Mobile {
    companion object {
        fun create(): Mobile {
            return Mobile()
        }
    }

    var screen: Screen? = null
}

fun main(args: Array<String>) {
    val launcher = Mobile.create()
    launcher.screen = MainScreen(1024, 768)
    launcher.screen?.onCreate()
    launcher.screen?.onDraw()
}