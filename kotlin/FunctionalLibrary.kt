package com.huawei.test

fun main() {
    // 1
    // how do we can change following call chains with single library functions?
    listOf(3, 7, 2, 5, 6)
            .filter { it <= 5 }
            .count()

    // 2
    // how do we can change following call chains with single library functions?
    listOf(null, 1, 4, null, 5)
            .map { it?.toDouble() }
            .filterNotNull()

    // 3
    // what will be returned by getOrPut method?
    val a = mutableMapOf<Int, Int>()
    a.getOrPut(1) { 2 }
}
