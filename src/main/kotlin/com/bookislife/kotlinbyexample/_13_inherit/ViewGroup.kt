package com.bookislife.kotlinbyexample._13_inherit

/**
 * 视图集合
 */
abstract class ViewGroup(width: Int, height: Int) : View(width, height) {

    abstract fun drawSelf()

    // 包含的所有子视图的集合
    private var children: MutableList<View> = mutableListOf()

    override fun isClickable(): Boolean {
        for (child in children) {
            if (child.isClickable()) {
                return false
            }
        }
        return true
    }

    // 用于向视图集合中添加视图
    protected fun addChild(child: View) {
        children.add(child)
    }

    override fun onDraw() {
        drawSelf()
        drawChildren()
    }

    private fun drawChildren() {
        for (child in children) {
            child.onDraw()
        }
    }
}