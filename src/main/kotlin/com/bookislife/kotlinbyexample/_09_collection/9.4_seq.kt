package com.bookislife.kotlinbyexample._09_collection

/**
 * 实例17：序列类型的常用方法
 */
fun main(args: Array<String>) {
    // 指定了seed 值为3
    val seqs = generateSequence(3) {
        // 通过it获得seed 值，生成第一个元素时为3，生成第二个元素时为8
        val t = it + 5
        if (t > 20) {
            null
        } else {
            t
        }
    }
    // 打印序列
    // 输出 3 8 13 18
    for (i in seqs) {
        println(i)
    }
}