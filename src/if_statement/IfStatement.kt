package if_statement

fun main() {
    val number1: Int = 100
    val number2: Int = 67
    val number3: Int = 150

    if (number1 > number2) println("$number1 is greater than $number2")
    if (number2 < number1) println("$number2 is less than $number1")

//    if else
    if (number1 > number2){
        println("$number1 is greater than $number2")
    } else{
        println("$number2 is less than $number1")
    }

//    if else-if
    if (number1 > number3){
        println("$number1 is greater than $number3")
    }else if(number3 > number1){
        println("$number3 is greater than $number1")
    }
    else{
        println("$number2 is less than $number1")
    }

//    if else ternary
    if (number1 > number2)  println("$number1 is greater than $number2") else println("$number2 is less than $number1")
}