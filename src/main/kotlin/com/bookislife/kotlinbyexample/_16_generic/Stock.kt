package com.bookislife.kotlinbyexample._16_generic

/**
 * 仓库类
 */
class Stock : Entity() {
    var name: String? = null
    var products: List<Product> = listOf()
}