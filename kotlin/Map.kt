package com.huawei.test

data class TestMap1(var x: Int, var y:Int)

fun main() {
    val testMap1 = TestMap1(1,2)
    val testMap2 = TestMap1(1, 3)
    val map = mapOf( testMap1 to "first", testMap2 to "second")
    testMap1.x = 1
    testMap1.y = 4

    // what will be printed here?
    println(map[testMap2])
    println(map[testMap1])
}