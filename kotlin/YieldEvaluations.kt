package com.huawei.test

// what will be printed using println calls below?

fun simpleYield() {
    val someNumbers = sequence {
        var x = 100
        while true {
            yield(x--)
        }
    }
    println(someNumbers.take(5).toList())
}

fun veryComplexYield() {
    val someSequence = sequence {
        println("First print")
        yield(1)
        println("Second print")
        yieldAll(2..5)
        println("Third print")
        yieldAll(listOf(6, 7, 8, 9))
        println("Fourth print")
    }
}
