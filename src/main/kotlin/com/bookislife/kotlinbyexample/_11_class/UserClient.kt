package com.bookislife.kotlinbyexample._11_class

/**
 * 11.10.3  创建客户端
 */
fun main(args: Array<String>) {
    val userManager = UserManager()

    // 注册两个用户
    userManager.register("Clark Kent", "Superman")
    userManager.register("Peter Park", "Spiderman")

    // 使用正确用户名和密码登录
    val clarkKent = userManager.login("Clark Kent", "Superman")
    clarkKent?.age = 24

    // 使用错误密码登录
    userManager.login("Clark Kent", "Batman")

    // 使用错误用户名和密码登录
    userManager.login("Diana", "Wonder Woman")

}