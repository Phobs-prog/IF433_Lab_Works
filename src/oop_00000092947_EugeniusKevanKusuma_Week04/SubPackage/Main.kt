package oop_00000092947_EugeniusKevanKusuma_Week04.SubPackage

fun main() {
    val vehicle = Vehicle("Toyota")
    val car = Car("Honda", 4)

    println("=== Vehicle ===")
    vehicle.honk()
    vehicle.accelerate()

    println("\n=== Car ===")
    car.honk()
    car.accelerate()
    car.openTrunk()

    println("\n=== Electric Car ===")
    val tesla = ElectricCar("Tesla", 4, 85)

    tesla.accelerate()
    tesla.honk()
    tesla.openTrunk()
}