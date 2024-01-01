package whenstatement

fun main() {
    val month: String = "January"
    val gender: String = "Male"

    when(month){
        "January" -> println("It is January")
        "February" -> println("It is February")
        "March" -> println("It is  March")
        "April" -> println("It is April")
        "May" -> println("It is May")
        "June" -> println("It is June")
        "July" -> println("It is July")
        "August" -> println("It is August")
        "September" -> println("It is September")
        "October" -> println("It is October")
        "November" -> println("It is November")
        "December" -> println("It is December")
       else -> println("Unknown month")
    }

    val g = when(gender){
        "Male" -> "MALE"
        "Female" -> "FEMALE"
        else -> "UNKNOWN"
    }

    println("Gender: $g")
}