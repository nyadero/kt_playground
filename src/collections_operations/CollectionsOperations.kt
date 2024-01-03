package collections_operations

fun main() {
    val numbers = setOf(1, 2, 3, 4, 5, 6,7 , 8, 9, 10)
    println(numbers.map { it * 10 })
    println(numbers.map { if (it == 3) it * 1000 else it * 100 })
    val numbersMap = mapOf<Int, Int>(1 to 1, 2 to 2, 3 to 3, 4 to 4, 5 to 5, 6 to 6, 7 to 7, 8 to 8, 9 to 9, 10 to 10)
    println(numbersMap.mapKeys { it.key * 5 + it.value * 10 })

//    zipping
    val colors = listOf<String>("blue", "black", "green", "red", "yellow")
    val animals = listOf<String>("hyena", "lion", "jaguar", "elephant", "puma")
//    println(colors.zip(animals))
    println(colors zip animals)
    println(colors.zip(animals){color, animal -> "The ${animal.replaceFirstChar { it.uppercase() }} is $color"})

//    unzip
    val numberPairs = listOf("one" to 1, "two" to 2, "three" to 3, "four" to 4, "five" to 5 )
    println(numberPairs)
    println(numberPairs.unzip())

//    associateWith
    val stringNumbers = listOf("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten")
    println(stringNumbers)
    println(stringNumbers.associateWith { it.length })
//    associate by
    println(stringNumbers.associateBy { it.first().uppercase() })

//    flatten
    val numberSets = listOf(setOf(1, 2, 3), setOf(4, 5, 6), setOf(7, 8, 9))
//    for (numbers in numberSets){
//        println(numbers)
//        for (number in numbers) println(number)
//    }
    println(numberSets.flatten())

    val numberStrings = listOf("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten")
    val listString = StringBuffer("The list of numbers is: ")
    println(numberStrings)
    println(numberStrings.joinToString())
    println(numberStrings.joinTo(listString))
    println(numberStrings.joinToString(separator = " | ", prefix = "Start: ", postfix = " :End"))

    val numbersRange = (1..100).toList()
    println(numbersRange)
    println(numbersRange.joinToString(limit = 30, truncated = "<...>"))

//    filtering
    println(numberStrings.filter { it.length > 3 })
    val mappedNumbers = mapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4, "five" to 5, "six" to 6, "seven" to 7, "eight" to 8, "nine" to 9, "ten" to 10 )
    println(mappedNumbers.filter { it.key.endsWith("e") && it.value > 5 })
    println(mappedNumbers.filterNot { it.key.length < 4 })

    val mixedList = listOf("name1", "name2", "name3", 1, 6, 9, 'A', 'c', 'L', false, true, true)
    mixedList.filterIsInstance<String>().forEach{ it -> println(it.replaceFirstChar { it.uppercase() }) }

//    partition
    println(numberStrings.partition { it.length > 3 }) // first set is matching an argument, second set is for the rest

//    minus and plus operators on collections
    val mutableNumbers = mutableListOf("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten")
//    println(mutableNumbers + "eleven")
//    println(mutableNumbers + "twenty")
    println(mutableNumbers + mutableListOf("twenty", "fifty"))
    println(mutableNumbers - mutableListOf("five", "seven"))

//    collections grouping
    println(numberStrings.groupBy { it.first().uppercase() })
    println(numberStrings.groupBy(keySelector = {it.first()}, valueTransform = {it.uppercase()}))

//    retrieving collection parts
    println(numberStrings.slice(1..5))
    println(numberStrings.slice(0..6 step 2))
    println(numberStrings.slice(setOf(0, 4, 8)))

    println(numberStrings.take(5)) // returns first five numbers
    println(numberStrings.takeLast(3)) // returns last three numbers
    println(numberStrings.drop(1))  // drops the first number
    println(numberStrings.dropLast(2)) // drops the last two numbers

    println()

    println(numberStrings.takeWhile { !it.startsWith("f") }) // returns numbers that do nat start with F
    println(numberStrings.takeLastWhile { it != "six" })
    println(numberStrings.dropLastWhile { it.contains("e") })
    println(numberStrings.dropWhile{it.length == 4})

//    chunked
    println(numbersRange.chunked(10))
    println(numbersRange.chunked(10){it.sum()})

//    number methods
    println("The sum is ${numbersRange.sum()} ")
    println("The average is ${numbersRange.average()} ")
    println("The count is ${numbersRange.count()} ")
    println("The min number is ${numbersRange.min()} ")
    println("The max number is ${numbersRange.max()} ")
    println("The sum is ${numbersRange.sumOf { it * 5 }} ")


}