package com.bookislife.kotlinbyexample._18_fun

import java.nio.charset.Charset

class WordCount {

    fun process(resourceName: String) {
        // 1. 读取文件，输出结果为由每行文本组成的列表
        val lines: List<String> = javaClass.getResourceAsStream(resourceName)
                .reader(Charset.forName("UTF-8"))
                .readLines()

        // 2. 将每行文本按空格进行分隔，输出结果为二维列表
        val linesWords: List<List<String>> = lines.map { it.split(" ") }

        // 3. 将列表中的数据进行拍平，输出结果为所有单词组成的列表
        val words: List<String> = linesWords.flatten()

        // 4. 将单词列表转换为由Pair(单词，出现次数)组成的列表
        val wordsCountPairs: List<Pair<String, Int>> = words.map {
            Pair(it, 1)
        }

        // 5. 按照单词统计步骤4的出现次数，输出结果为由单词和出现次数组成的映射
        val wordsCount = wordsCountPairs
                .fold(mutableMapOf<String, Int>()) { map, pair ->
                    val count = map[pair.first]
                    map[pair.first] = (count ?: 0) + pair.second
                    map
                }

        // 6. 输出结果
        wordsCount.forEach { word, count ->
            println("$word 出现了 $count 次")
        }
    }

}