package com.huawei.test

private class TestMap2(var x: Int, var y:Int)

fun main() {
    val testMap = TestMap2(1, 3)
    // how to override "in"
    println (testMap in 0..6)
    // how to negate in?
}
