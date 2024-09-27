package com.example.kotlinbasics


fun sum(a: Int, b: Int): Int {
    return a + b
}


val multiply: (Int, Int) -> Int = { x, y -> x * y }


fun operate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun main() {

    val result = sum(10, 20)
    println("Sum: $result")


    val product = multiply(5, 4)
    println("Product: $product")


    val additionResult = operate(10, 5, ::sum)
    println("Addition using Higher-Order Function: $additionResult")

    val multiplicationResult = operate(6, 7, multiply)
    println("Multiplication using Higher-Order Function: $multiplicationResult")
}
