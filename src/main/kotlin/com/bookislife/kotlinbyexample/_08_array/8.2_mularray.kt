package com.bookislife.kotlinbyexample._08_array

/**
 * 实例13：用多维数组输出图形
 */
fun main(args: Array<String>) {
    // 定义元数据，1表示打印星号，0表示打印空格
    val dots = arrayOf(
            arrayOf(1, 0, 0, 0, 0, 1),
            arrayOf(1, 0, 0, 0, 0, 1),
            arrayOf(1, 0, 0, 0, 1, 0),
            arrayOf(1, 0, 0, 1, 0, 0),
            arrayOf(1, 0, 1, 0, 0, 0),
            arrayOf(1, 1, 0, 0, 0, 0),
            arrayOf(1, 0, 1, 0, 0, 0),
            arrayOf(1, 0, 0, 1, 0, 0),
            arrayOf(1, 0, 0, 0, 1, 0),
            arrayOf(1, 0, 0, 0, 0, 1),
            arrayOf(1, 0, 0, 0, 0, 1)
    )
    // 循环打印
    for (rowArray in dots) {
        for (n in rowArray) {
            if (n == 1) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
}