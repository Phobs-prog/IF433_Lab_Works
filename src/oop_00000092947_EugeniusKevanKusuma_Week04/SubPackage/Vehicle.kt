package oop_00000092947_EugeniusKevanKusuma_Week04.SubPackage

open class Vehicle(
    val brand: String
) {
    open fun honk() {
        println("$brand berbunyi: Beep beep!")
    }

    open fun accelerate() {
        println("$brand sedang berakselerasi.")
    }
}