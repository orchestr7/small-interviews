package com.huawei.test

// functional style
data class Employees(val name: String, val surname: String, val sentDailyReport: Boolean, val averageMark: Double)

fun main() {
    val employees: List<Employees> = /* initialization */
    // find 10 employees that sent daily reports and have averageMark more than 4.0
    // a) in alphabetical order
    // b) save initial order
}
