package arrays

fun main() {
//    array of strings
    val names = arrayOf<String>("Nyadero", "Lydia", "David", "Leah") // array of strings
    val ages = intArrayOf(25, 76, 38, 61, 54, 82, 67) // array of integers
    val weights = doubleArrayOf(56.82, 63.9, 59.01) // array of doubles

//    prints all the names in the array
    println(names.contentToString())
//    prints first name
    println(names[0])
//    prints second name
    println(names[1])
    names[0] = "Brian"
    println(names[0])
//   prints the size of elements in array
    println(names.size)
//    check if array contains a value
    println("Odhiambo" in names) // false

//    null arrays
    val arrayOfNulls = arrayOfNulls<String>(15)
    println(arrayOfNulls.contentToString())
    arrayOfNulls[10] = "Anastacia"
    println(arrayOfNulls.contentToString())

}