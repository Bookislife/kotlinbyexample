package com.bookislife.kotlinbyexample._16_generic

import java.math.BigDecimal

/**
 * 商品类
 */
class Product : Entity() {
    var code: String? = null
    var name: String? = null
    var price: BigDecimal? = null
}
