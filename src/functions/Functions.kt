package functions

fun main() {
    var  name: String = "Nyadero"
    println("Introduction to functions")
//    greet()
//    greetUser(name, 26, "male")
//    greetUser("Lydia", 16)
//    greetUser(age=67, name="Alice")
    println(doubleNumber(10.0))


    foo(bar = {
        println("Bar as a function")
    })

    foo { println("baz baz buz buzzzzzzzz") }

    val (t1, t2, t3) = threeValues()
    println("$t1, $t2, $t3")
}

fun greet(){
    println("Hello")
}

// function accepting a  parameter
fun greetUser(name:String, age: Int, gender: String? = null) {
    println("Hello, $name")
    if (age >= 18){
        println("$name is an adult")
    }
    if (gender != null) println("$name is a $gender")
}

//  function accepting function as a parameter
fun foo(bar: () -> Unit){
    println("Bar function")
    bar()
}

fun doubleNumber(number: Double): Double{
    return number * number
}

fun sumNumber(number1: Int, number2: Int): Int{
    return number1 + number2
}

//  functions as single line expressions
fun multiplyNumbers(num1:Int, num2:Int, num3:Int): Int = num1*num2*num3

fun twoValues(): Pair<String, Int> {
    return Pair("Message", 36)
}

fun threeValues(): Triple<String, Int, Char>{
    return Triple(
        "Name",
        20,
        'B'
    )
}