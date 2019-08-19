package com.bookislife.kotlinbyexample._16_generic

import java.util.*

/**
 * 持久化基类
 */
open class Entity {
    var id: Long? = null
    var createdAt: Date? = null
    var updatedAt: Date? = null
}

