package com.bookislife.kotlinbyexample._21_io

import java.math.BigDecimal

/**
 * 订单类
 */
data class Order(val orderNo: String,
                 val productName: String,
                 val orderPrice: BigDecimal,
                 var tradeStatus: TradeStatus = TradeStatus.INIT) {
    companion object {
        fun fromLine(line: String): Order {
            val array = line.split(",")
            val order = Order(array[0], array[1], BigDecimal(array[2]), TradeStatus.fromCode(array[3]))
            return order
        }
    }
}