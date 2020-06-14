package com.huawei.test

// implement isNullOrEven() method for Int? type

fun main() {
    val number1: Int? = null
    val number2: Int? = 0
    val number3: Int? = 1
    val number4: Int? = 2

    number1.isNullOrEven() == true
    number2.isNullOrEven() == true
    number3.isNullOrEven() == false
    number4.isNullOrEven() == true
}
