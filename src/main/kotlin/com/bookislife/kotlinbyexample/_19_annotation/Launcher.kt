package com.bookislife.kotlinbyexample._19_annotation

import java.math.BigDecimal

/**
 * 19.3  实例27：通过反射和注解完成对象的序列化
 */
fun main(args: Array<String>) {
    // 创建待序列化的对象
    val product = Product("001")
    with(product) {
        name = "高等数学"
        price = BigDecimal("58")
        features.add(Feature("category", "教育"))
        features.add(Feature("applicable", "大学生"))
    }
    val serializer = JsonSerializer()
    // 执行序列化操作
    val json = serializer.serialize(product)
    println(json)
}