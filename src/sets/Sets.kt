package sets

fun main(){
    val names = mutableSetOf<String>("name1", "name2", "name3", "name4", "name5", "name1", "name1", "name2") // stores only unique values
    val users = mutableSetOf<User>(User("name1"), User("name2"), User("name3"), User("name4"), User("name5"), User("name6"))
    names.add("name6")
    println(names)
    println(users)
}

data class User(val name: String){

}