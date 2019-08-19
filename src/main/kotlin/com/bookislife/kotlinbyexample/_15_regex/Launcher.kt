package com.bookislife.kotlinbyexample._15_regex

/**
 * 15.3  实例24：使用正则表达式解析网页
 */
fun main(args: Array<String>) {
    // 网页
    val html = """
    <!DOCTYPE html>
    <html lang="zh-cn">
    <head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>测试网页</title>
    </head>
    <body>
        <div>
            <a href='http://xxx.yyy.zzz'>Test1</a>
            <a href="http://aaa.bbb.ccc">Test2</a>
        </div>
    </body>
    </html>
    """.trimIndent()

    // 测试
    val spider = Spider()
    val links = spider.accept(html)
    for (link in links) {
        println(link)
    }
}