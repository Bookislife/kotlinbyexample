package com.bookislife.kotlinbyexample._19_annotation

import java.math.BigDecimal
import kotlin.reflect.full.memberProperties

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


/**
 * 对象序列化器
 */
class JsonSerializer {

    /**
     * 解析列表类型的属性值<br>
     *
     * @param name 属性名
     * @param array 属性值
     * @return 解析结果，例： x: [{"x": "y"}]
     */
    private fun parseList(name: String, array: List<*>): String {
        return buildString {
            append("\"")
            append(name)
            append("\": ")
            append("[")
            val json = array.mapNotNull {
                parseObject(it!!)
            }.joinToString(",")
            append(json)
            append("]")
        }
    }

    /**
     * 解析普通类型的属性值
     *
     * @param name 属性名
     * @param value 属性值
     * @return 解析结果，例： "x": "y"
     */
    private fun parseProperty(name: String, value: Any?): String {
        return """"$name": "$value""""
    }

    /**
     * 解析对象
     *
     * @param any 被序列化的对象
     * @return 解析结果，例： {"x": "y"}
     */
    private fun parseObject(any: Any): String {
        // KClass对象
        val clazz = any::class
        // 使用反射API获得所有属性
        val json = clazz.memberProperties
                // 过滤应用了JsonExclude注解的属性
                .filter {
                    val annotations = it.annotations
                    // 查询属性上是否应用了JsonExclude注解
                    val jsonExclude = annotations.firstOrNull { anno ->
                        anno.annotationClass.qualifiedName ==
                                JsonExclude::class.qualifiedName
                    }
                    // 返回true表示该数据不需要被过滤，返回false则相反
                    jsonExclude == null
                }
                // 遍历并以逗号作为分隔符拼接各个属性转换后的字符串
                .joinToString(",") {
                    // 获取属性值
                    val propertyValue = it.call(any)
                    // 查询属性是否应用了JsonField注解
                    val annotations = it.annotations
                    val jsonField = annotations.firstOrNull { anno ->
                        anno.annotationClass.qualifiedName == JsonField::class.qualifiedName
                    }
                    val fieldName = if (jsonField == null) {
                        it.name
                    } else {
                        // 应用了JsonField注解后，序列化后的字段名就采用该注解的参数
                        (jsonField as JsonField).name
                    }
                    if (propertyValue is List<*>) {
                        parseList(fieldName, propertyValue)
                    } else {
                        parseProperty(fieldName, propertyValue)
                    }
                }
        return "{$json}"
    }

    // 用于序列化对象
    fun serialize(any: Any): String = parseObject(any)
}