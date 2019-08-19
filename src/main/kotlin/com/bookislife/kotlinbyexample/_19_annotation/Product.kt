package com.bookislife.kotlinbyexample._19_annotation

import java.math.BigDecimal

class Product(@JsonField("product_code") val productCode: String) {
    @JsonExclude
    var id: Int = 0
    @JsonField("product_name")
    var name: String? = null
    var price: BigDecimal = BigDecimal.ZERO
    var features: MutableList<Feature> = mutableListOf()
}
