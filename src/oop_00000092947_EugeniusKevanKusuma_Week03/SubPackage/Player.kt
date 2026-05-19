package oop_00000092947_EugeniusKevanKusuma_Week03.SubPackage

class Player(
    val username: String
) {

    private var xp = 0

    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount <= 0) {
            println("XP must be positive!")
            return
        }

        val oldLevel = level
        xp += amount

        if (level > oldLevel) {
            println("Level Up! Selamat $username naik ke level $level")
        }
    }

    fun displayInfo() {
        println("=== PLAYER INFO ===")
        println("Username : $username")
        println("Level    : $level")
    }
}