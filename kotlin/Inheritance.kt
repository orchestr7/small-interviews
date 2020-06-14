package com.huawei.test

// Kotlin - is a truely null safe language, but what will happen in the following code?

open class A(open val value: String) {
    init {
        value.replace("a", "")
    }
}

class B(override val value: String) : A(value)

fun main() {
    B("a")
}