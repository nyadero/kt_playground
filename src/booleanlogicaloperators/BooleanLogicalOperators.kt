package booleanlogicaloperators

fun main() {
    val isMale: Boolean = true
    val isAdult: Boolean = true
    val isAttached: Boolean = false
    val isDriver: Boolean = true

//    logical AND
    println(isMale && isAdult) // returns true
    println(isMale && isAttached) // returns false
    println(!isMale && !isAdult) // returns false
    println(isMale && !isAdult) // returns false
    println(isMale && isAdult && isDriver) // returns true

//    logical OR
    println(isMale || isAdult) // returns true
    println(isMale || isAttached) // returns true
    println(!isMale || !isAdult) // returns false
    println(isMale || !isAdult) // returns true
    println(isMale || isAdult || isDriver) // returns true
}