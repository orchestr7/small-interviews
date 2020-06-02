package com.huawei.test

open class A(open val value: String) {
    init {
        value.replace("a", "")
    }
}

class B(override val value: String) : A(value)

fun main() {
    B("a")
}