package com.example.kotlinbasics

open class Person(private val name: String, private val age: Int, private val email: String) {
    open fun displayInfo() {
        println("Name: $name, Age: $age, Email: $email")
    }
}

class Employee(name: String, age: Int, email: String, private val salary: Double) : Person(name, age, email) {
    override fun displayInfo() {
        super.displayInfo()
        println("Salary: $salary")
    }
}

class BankAccount {
    private var balance: Double = 0.0

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Deposited: $amount, New Balance: $balance")
        } else {
            println("Invalid deposit amount")
        }
    }

    fun withdraw(amount: Double) {
        if (amount > 0 && amount <= balance) {
            balance -= amount
            println("Withdrew: $amount, New Balance: $balance")
        } else {
            println("Insufficient balance or invalid amount")
        }
    }

    fun getBalance(): Double {
        return balance
    }
}

fun main() {
    // Test Person Class
    val person = Person("Derbis Erzhan", 22, "yerslan@gmail.com")
    person.displayInfo()

    // Test Employee Class
    val employee = Employee("Sabit Dara", 28, "dara@gmail.com", 60000.0)
    employee.displayInfo()

    // Test BankAccount Class
    val bankAccount = BankAccount()
    bankAccount.deposit(1000.0)
    bankAccount.withdraw(500.0)
    bankAccount.withdraw(600.0) // This should show an error
    println("Final Balance: ${bankAccount.getBalance()}")
}
