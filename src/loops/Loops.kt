package loops

fun main() {
    var number: Int = 1
    val names = arrayOf<String>("Nyadero", "Lydia", "David", "Leah") // array of strings
    val ages = intArrayOf(25, 76, 38, 61, 54, 82, 67) // array of integers

//    for loops
    for (name in names) println(name)
    for (age in ages) println(age)

//    range
//    for (i in 1..100 step 10 ) println("i: $i")
//    for (i in 5 downTo 1)  println("i: $i")

//    for each loop
    names.forEach { it -> println(it) }

//    while loop
    while (number <= 5){
        println("Number: $number")
        ++number
    }
}