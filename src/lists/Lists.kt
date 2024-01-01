package lists

fun main() {
    val names = mutableListOf<String>("Odhiambo", "Kamau", "Wafula", "Swaleh", "Mwanza", "kibet")

//    print all values in the list
    println(names)
//    print first name
    println(names.first())
//    last element
    println(names.last())
//    print size of the list
    println(names.size)
//    check if array contains an element
    println(names.contains("Wafula"))
//    remove element
    names.remove("Kibet")
//    add
    names.add("Achoki")

//    destructuring arrays or lists
    val (first, second, third, _, _) = names
    println("$first, $second, $third")
}