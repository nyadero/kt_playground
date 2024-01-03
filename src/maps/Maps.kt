package maps

fun main() {
//    val users = mapOf<Int, String>(1 to "name1", 2 to "name2", 3 to "name3", 4 to "name4")
    val users = mutableMapOf<Int, String>(1 to "name1", 2 to "name2", 3 to "name3", 4 to "name4")

    println(users[1])
    users[5] = "name5"
    users.remove(3)
    println(users)
    users.forEach{ k, v ->
        println("$k to $v")
    }
}