package com.bookislife.kotlinbyexample._11_class

/**
 * 11.10.2  创建用户管理类
 */
class UserManager {

    // 保存所有用户，实际应用中由数据库替代
    val users: MutableMap<String, User> = mutableMapOf()

    /**
     * 注册用户
     *
     * @param username 用户名
     * @param password 密码
     */
    fun register(username: String, password: String) {
        if (users.containsKey(username)) {
            println("用户已存在")
            return
        }
        users[username] = User(username, password)
        println("$username 注册成功")
    }

    /**
     * 用户登录
     *
     * @param username 用户名
     * @param password 密码
     * @return 登录成功时返回登录用户，否则返回null
     */
    fun login(username: String, password: String): User? {
        if (!users.containsKey(username)) {
            println("用户登录失败")
            return null
        }
        val user = users[username]!!
        if (user.isPasswordMatched(password)) {
            println("$username 登录成功")
            return user
        }
        println("用户登录失败")
        return null
    }

    /**
     * 更新密码
     *
     * @param username 用户名
     * @param oldPassword 旧密码
     * @param newPassword 新密码
     */
    fun changePassword(username: String, oldPassword: String, newPassword: String) {
        if (!users.containsKey(username)) {
            return
        }
        val userFromDb = users[username]!!
        val success = userFromDb.changePassword(oldPassword, newPassword)
        if (success) {
            println("更新成功")
        } else {
            println("更新失败")
        }
    }

    /**
     * 用户注销
     */
    fun logout(user: User) {
        users.remove(user.username)
    }
}