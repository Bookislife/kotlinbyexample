package com.bookislife.kotlinbyexample._11_class

/**
 * 11.7.5 延迟初始化属性
 */
class Activity {

    lateinit var btnOk: Button
    lateinit var btnCancel: Button

    fun onCreate() {
        btnOk = Button()
        btnCancel.text = "Cancel"
    }

}

fun main(args: Array<String>) {
    val activity = Activity()
    activity.onCreate()
}