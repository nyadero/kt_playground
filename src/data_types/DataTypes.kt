package data_types

const val PI : Double = 3.142
fun main() {
   var name: String = "Nyadero Brian Odhiambo"  // string data type
    var age: Int = 25 // integer data type
    var isMale: Boolean = true // boolean data type
    var salary: Double = 758_000_000.98 // double data type
    var drivenDistance: Long = 637827891838L  // long data type
    var height: Float = 1.7F // float data type
    var initial: Char = 'B'  // char data type
    var nickName: Any = "Bronyst" // any data type

    println("Name: $name, Age: $age, Male: $isMale, salary: $salary")

//    values of var can be changed
    name = "John Doe"
    println("Changed name: $name " )

 println("Constant value of pi: $PI")
}