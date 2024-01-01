package strings

fun main() {
    var name: String = "John Doe"
    var name2: String = "Jane Doe"
//    uppercase
    println(name.uppercase())
    // lower case
    println(name.lowercase())
    // characters number
    println(name.length)
    // first character
    println(name[0])
    // capitalize
    println(name.capitalize())
//    is string empty
    println(name.isEmpty())
    // join two strings
    println(name.plus(" $name2"))
}