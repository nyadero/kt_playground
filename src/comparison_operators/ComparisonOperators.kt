package comparison_operators

fun main() {
    val num1: Int = 30
    val num2: Int = 50

    println(num1 >= num2) // returns false
    println(num2 >= num1) // returns true
    println(num1 <= num2) // returns true
    println(num2 <= num1) // returns false
    println(num1 == num2) // returns false
}