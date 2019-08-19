package com.bookislife.kotlinbyexample._04_var

/**
 * 实例4：变量和常量的对比——可变性和不可变性
 */
fun main(args: Array<String>) {
    // 变量
    // 定义后再初始化
    var moneyInPocket: Int
    moneyInPocket = 100

    // 定义同时初始化
    var moneyInAlipay = 100

    // 值
    // 定义同时初始化
    val phone = 12345678910

    // 按条件延迟初始化
    val payChannel: String
    val os = "iOS"
    if (os == "iOS") {
        payChannel = "App Store"
    } else if (os == "Android") {
        payChannel = "Google Play"
    } else {
        payChannel = "Offline"
    }
}