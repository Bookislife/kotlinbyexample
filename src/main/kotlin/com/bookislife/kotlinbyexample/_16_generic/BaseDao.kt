package com.bookislife.kotlinbyexample._16_generic

import java.util.*

/**
 * Dao基类，负责持久化操作
 */
// 设置上界是为了能够访问Entity类的属性
abstract class BaseDao<T : Entity> : Dao<T> {
    // 表示数据库
    var table = mutableMapOf<Long, T>()

    // 保存数据
    override fun save(t: T): Long {
        // 设置共通属性
        t.id = System.currentTimeMillis()
        t.createdAt = Date()
        t.updatedAt = t.createdAt
        table[t.id!!] = t
        return t.id!!
    }

    // 获取数据
    override fun get(id: Long): T? {
        return table[id]
    }
}