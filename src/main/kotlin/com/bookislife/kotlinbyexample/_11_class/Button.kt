package com.bookislife.kotlinbyexample._11_class

class Button constructor(var text: String, width: Int, height: Int) {

    val processedHeight: Int

    init {
        println("执行主构造方法初始化语句块")
        processedHeight = if (height < 0) 0 else height
    }

    var onClickListener: OnClickListener? = null

    //  副构造方法
    //  调用主构造方法
    constructor(text: String) : this(text, 0, 0) {
        println("执行主构造方法初始化语句块")
    }

    //  调用主构造方法
    constructor(width: Int, height: Int) : this("", width, height) {
    }

    //  调用其它副构造方法
    constructor() : this("默认按钮") {

    }

    fun click() {
        onClickListener?.onClick()
    }

    fun longClick() {

    }
}

class OnClickListener {
    fun onClick() {
    }
}


fun main(args: Array<String>) {
    val button = Button("xx", 1, 1)

    val btnHello = Button("Hello", 120, 30)
    val btnLarge = Button(320, 60)
    val btnDefault = Button()

    var lazy: Map<String, String>
}