package com.bookislife.kotlinbyexample._21_io

import java.math.BigDecimal

/**
 * 21.3  实例29：读取并解析CSV文件
 */
fun main(args: Array<String>) {
    // 获取CSV文件的输入流，该文件需放在resources目录下
    val input = ::CSVReader.javaClass.getResourceAsStream("/trade.csv")
    // 创建CSV解析类
    val reader = CSVReader(input)
    val lines = reader.readLines()
    // 解析第一行数据
    val metaData = lines[0].split(",")
    val count = metaData[0]
    val sumPrice = metaData[1]
    // 转换数据为实体类
    val orders = lines.subList(1, lines.size).map {
        Order.fromLine(it)
    }.toList()
    // 统计总支付成功的订单金额数
    val sum = orders.filter {
        it.tradeStatus == TradeStatus.SUCCESS
    }.map {
        it.orderPrice
    }.reduce { acc, decimal ->
        acc.add(decimal)
    }
    // 将解析后的数据与CSV文件头中的数据进行对比，不一致的话则认为文件被损坏
    assert(count.toInt() == orders.size)
    assert(BigDecimal(sumPrice) == sum)
    // 打印获取到的数据
    orders.forEach {
        println(it)
    }
}
