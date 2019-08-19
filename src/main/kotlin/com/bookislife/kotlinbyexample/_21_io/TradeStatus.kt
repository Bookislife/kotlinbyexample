package com.bookislife.kotlinbyexample._21_io

/**
 * 支付状态
 */
enum class TradeStatus(val code: String) {
    SUCCESS("1"), FAILED("0"), INIT("-1");

    companion object {
        // 通过枚举值获得枚举常量
        fun fromCode(code: String): TradeStatus {
            return values().first {
                it.code == code
            }
        }
    }
}