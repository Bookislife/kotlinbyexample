package com.bookislife.kotlinbyexample._15_regex

class Spider {
    // 匹配规则
    val regex = """(?<=href=)(['"]).+(\1)""".toRegex()

    // 解析操作
    fun accept(html: String): List<String> {
        val results = regex.findAll(html)
        // 将Sequence<MatchResult>转换为List<String>
        return results.map { it.value }.toList()
    }
}