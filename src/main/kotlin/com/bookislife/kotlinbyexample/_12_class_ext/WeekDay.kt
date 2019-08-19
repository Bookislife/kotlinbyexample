package com.bookislife.kotlinbyexample._12_class_ext

/**
 * 12.7.2  实例22：使用枚举类来处理日期
 */
// 定义表示一周的枚举类
enum class WeekDay(val abbr: String) {
    Monday("Mon"), Tuesday("Tue"), Wednesday("Wed"), Thursday("Thu"),
    Friday("Fri"), Saturday("Sat"), Sunday("Sun");

    // 添加了自定义方法，所以上面的枚举常量列表需要以分号结尾
    // 判断是否是工作日
    fun isWorkingDay(): Boolean {
        return !(this == Saturday || this == Sunday)
    }
}

fun main(args: Array<String>) {
    // 直接引用枚举常量
    val monday = WeekDay.Monday
    // 通过常量名获得枚举常量
    val mondayByName = WeekDay.valueOf("Monday")
    // 打印枚举对象的name属性，输出Monday
    println(monday.name)
    println(mondayByName.name)

    // 枚举常量名不存在时抛出 java.lang.IllegalArgumentException: No enum constant
    //WeekDay.valueOf("March")

    // 通过位置获得枚举常量
    val mondayByOrder = WeekDay.values()[0]
    println(mondayByOrder.ordinal)

    // 调用普通方法
    println(WeekDay.Tuesday.isWorkingDay())

}