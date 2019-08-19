package com.bookislife.kotlinbyexample._11_class

/**
 * 11.10.1  创建用户类
 */
// 用户名为公有属性，密码为私有属性
class User(val username: String, private var password: String) {
    // 非空属性，年龄默认值为0
    var age: Int = 0
        set(value) {
            if (value > 0) {
                field = value
            }
        }
    // 可空属性：国家
    var country: String? = null

    /**
     * 判断传入的密码是否与当前用户密码一致
     *
     * @param password 传入的密码
     */
    fun isPasswordMatched(password: String): Boolean = this.password == password

    /**
     * 更新密码
     *
     * @param oldPassword 旧密码
     * @param newPassword 新密码
     */
    fun changePassword(oldPassword: String, newPassword: String): Boolean {
        if (isPasswordMatched(oldPassword)) {
            this.password = newPassword
            return true
        }
        return false
    }

    override fun toString(): String {
        return "User(username='$username', password='$password', age=$age, country=$country)"
    }

}