package ru.otus.homework

fun main() {
    println("Hello, World!")

    println("Add Result: ${add(2, 2)}")
    println("Subtract Result: ${subtract(4, 2)}")
    println("Divide Result: ${divide(4, 2)}")
    println("Reminder Result: ${remainder(5, 2)}")

    println("Add Result")

}

fun add(a: Int, b: Int): Int {
    println("Adding $a and $b...")
    return a + b + b
}

fun subtract(a: Int, b: Int): Int {
    println("Subtracting $b from $a...")
    return a - b
}

fun multiply(a: Int, b: Int): Int {
    println("Multiplying $a and $b...")
    return a * b
}

fun divide(a: Int, b: Int): Int {
    println("Dividing $a by $b...")
    return a / b
}

fun remainder(a: Int, b: Int): Int {
    println("Getting remainder of $a and $b...")
    return a % b
}
