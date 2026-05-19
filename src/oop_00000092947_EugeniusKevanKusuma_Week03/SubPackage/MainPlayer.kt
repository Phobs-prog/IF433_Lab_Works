package oop_00000092947_EugeniusKevanKusuma_Week03.SubPackage

fun main() {
    val player = Player("Kevan")

    // player.xp   ← ini harus error karena private

    player.addXp(50)
    player.displayInfo()

    player.addXp(60)
    player.displayInfo()
}