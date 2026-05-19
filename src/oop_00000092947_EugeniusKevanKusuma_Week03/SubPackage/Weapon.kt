package oop_00000092947_EugeniusKevanKusuma_Week03.SubPackage

class Weapon(
    val name: String,
    damageInput: Int
) {

    var damage = damageInput
        set(value) {
            when {
                value < 0 -> {
                    println("Damage cannot be negative!")
                }

                value > 1000 -> {
                    println("Damage too high! Set to 1000.")
                    field = 1000
                }

                else -> {
                    field = value
                }
            }
        }

    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }

    fun displayWeapon() {
        println("=== WEAPON INFO ===")
        println("Name   : $name")
        println("Damage : $damage")
        println("Tier   : $tier")
    }
}