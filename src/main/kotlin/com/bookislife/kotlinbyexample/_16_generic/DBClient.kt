package com.bookislife.kotlinbyexample._16_generic

import java.math.BigDecimal

fun main(args: Array<String>) {
    // 持久化Product类
    val productDao = ProductDao()
    val product = Product().apply {
        code = "B000001"
        name = "Kotlin入门"
        price = BigDecimal("60")
    }
    val pid = productDao.save(product)
    val productRet = productDao.get(pid)

    // 持久化Stock类
    val stockDao = StockDao()
    val stock = Stock().apply {
        name = "一号仓库"
        products = listOf(product)
    }
    val sid = stockDao.save(stock)
    val stockRet = stockDao.get(sid)
}