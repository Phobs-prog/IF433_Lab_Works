package oop_00000092947_EugeniusKevanKusuma_Week03.SubPackage

class Employee(
    val name: String,
    salaryInput: Int
) {

    var salary = salaryInput
        set(value) {
            if (value < 0) {
                println("Warning: Salary cannot be negative!")
            } else {
                field = value
            }
        }

    private var performanceRating = 3

    fun updateRating(newRating: Int) {
        if (newRating in 1..5) {
            performanceRating = newRating
        } else {
            println("Invalid rating! Must be between 1 and 5.")
        }
    }

    val bonus: Int
        get() = salary * performanceRating / 10

    fun displayInfo() {
        println("=== EMPLOYEE INFO ===")
        println("Name   : $name")
        println("Salary : $salary")
        println("Bonus  : $bonus")
    }
}