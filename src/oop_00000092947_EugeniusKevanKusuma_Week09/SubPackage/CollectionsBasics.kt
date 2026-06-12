package oop_00000092947_EugeniusKevanKusuma_Wekk09.SubPackage

fun main() {

    // Immutable List
    val fruits = listOf(
        "Apple",
        "Banana",
        "Orange"
    )

    println(fruits)

    // Mutable List
    val numbers = mutableListOf(
        10,
        20,
        30
    )

    numbers.add(40)
    numbers.remove(20)

    println(numbers)

    // Set
    val students = setOf(
        "Kevin",
        "John",
        "Kevin",
        "Maria"
    )

    println(students)

    // Map
    val scores = mapOf(
        "Math" to 90,
        "Physics" to 85,
        "Programming" to 100
    )

    println(scores)
}