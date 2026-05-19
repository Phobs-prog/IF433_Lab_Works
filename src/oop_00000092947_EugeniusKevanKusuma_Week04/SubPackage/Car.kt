package oop_00000092947_EugeniusKevanKusuma_Week04.SubPackage

class Car(
    brand: String,
    val numberOfDoors: Int
) : Vehicle(brand) {

    override fun honk() {
        println("$brand berbunyi: Tiiin tiiin!")
    }

    override fun accelerate() {
        super.accelerate()
        println("$brand melaju lebih cepat di jalan raya.")
    }

    fun openTrunk() {
        println("Bagasi $brand dibuka.")
    }
}