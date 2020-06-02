package com.huawei.test

fun main() {
    var list1 = listOf(1,2,3)
    val list2 = list1
    list1 += 4

    println(list1)
    println(list2)
}
