package com.example.kotlinbasics

// 1. Variables and Data Types
fun main() {
    // Declare variables of different data types
    val myInt: Int = 10
    val myDouble: Double = 20.5
    val myString: String = "Hello, Kotlin!"
    val myBoolean: Boolean = true

    // Print variables
    println("Integer: $myInt")
    println("Double: $myDouble")
    println("String: $myString")
    println("Boolean: $myBoolean")

    // 2. Conditional Statements
    checkNumber(10)  // Test positive number
    checkNumber(-5)  // Test negative number
    checkNumber(0)   // Test zero

    // 3. Loops
    printNumbers()   // Print numbers 1 to 10

    // 4. Collections
    sumOfList()     // Sum of list numbers
}

// Conditional Statements
fun checkNumber(num: Int) {
    if (num > 0) {
        println("$num is positive")
    } else if (num < 0) {
        println("$num is negative")
    } else {
        println("$num is zero")
    }
}

// Loops
fun printNumbers() {
    println("Using for loop:")
    for (i in 1..10) {
        println(i)
    }

    println("Using while loop:")
    var i = 1
    while (i <= 10) {
        println(i)
        i++
    }
}

// Collections
fun sumOfList() {
    val numbers = listOf(1, 2, 3, 4, 5)
    var sum = 0

    for (num in numbers) {
        sum += num
    }

    println("Sum of numbers: $sum")
}
