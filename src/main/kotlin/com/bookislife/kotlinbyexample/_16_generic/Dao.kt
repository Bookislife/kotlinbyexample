package com.bookislife.kotlinbyexample._16_generic

/**
 * Dao接口，对持久化方法进行抽象
 */
interface Dao<T> {
    fun save(t: T): Long
    fun get(id: Long): T?
}
