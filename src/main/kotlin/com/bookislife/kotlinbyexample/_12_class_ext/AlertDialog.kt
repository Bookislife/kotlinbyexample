package com.bookislife.kotlinbyexample._12_class_ext

/**
 * 12.4.2  伴生对象的应用
 */
class AlertDialog(private var title: String, var message: String) {
    // 外部类中的私有属性
    private var shown: Boolean = false

    fun copy(): AlertDialog {
        // 外部类访问伴生对象中的私有属性
        countOfInstance++
        return AlertDialog(title, message)
    }

    fun show(message: String) {
        println("调用外部类中的show()")
        val dialog = create(message)
        dialog.shown = true
    }

    // 伴生对象
    companion object Factory {
        // 伴生对象中的私有属性
        private var countOfInstance: Int = 0

        fun create(message: String): AlertDialog {
            countOfInstance++
            return AlertDialog("Default", message)
        }

        fun show(message: String) {
            println("调用伴生对象中的show()")
            val dialog = create(message)
            // 伴生对象访问外部类中的私有属性
            dialog.shown = true
        }

    }
}

fun main(args: Array<String>) {
    val dialog = AlertDialog.create("这是一个普通的对话框")
    AlertDialog.show("直接显示对话框")
    dialog.show("hello world")
    AlertDialog.Factory.show("hello world")
}