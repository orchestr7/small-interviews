// implement isNullOrEven() method for Int?

fun main() {
    val number1: Int? = null
    val number2: Int? = 0
    val number3: Int? = 1
    val number4: Int? = 2

    number1.isNullOrEven() eq true
    number2.isNullOrEven() eq true
    number3.isNullOrEven() eq false
    number4.isNullOrEven() eq true
}
