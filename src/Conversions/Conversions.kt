package Conversions

fun main() {
    var number: String = "10"
    val number2: Int = 20

//    string to int conversion
    println("Converted: ${number.toInt()}")
//    int to string
    println("Converted: ${number2.toString()}")
//    int to double
    println("Converted: ${number2.toDouble()}")
//   int to float
    println("Converted: ${number2.toFloat()}")
//   int to long
    println("Converted: ${number2.toLong()}")
}