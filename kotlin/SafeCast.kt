// declare and initialize s variable so it will return null in first line
// and throw cast exception on the second line

fun main(args: Array<String>) {
    val s = TODO()
    println(s as? Int)    // null
    println(s as Int?)    // exception
}