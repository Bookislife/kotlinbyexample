package com.bookislife.kotlinbyexample._21_io

import java.io.InputStream
import java.io.InputStreamReader

/**
 * 读取 CSV 的工具类
 */
class CSVReader(val input: InputStream) {

    fun readLines(): List<String> {
        return InputStreamReader(input).readLines()
    }
}