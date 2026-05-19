package oop_00000092947_EugeniusKevanKusuma_Week02.SubPackage

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter hero name: ")
    val heroName = scanner.nextLine()

    print("Enter hero damage: ")
    val damage = scanner.nextInt()

    val hero = Hero(heroName, damage)
    var enemyHp = 100

    while (hero.isAlive() && enemyHp > 0) {
        println("\n=== BATTLE MENU ===")
        println("1. Serang")
        println("2. Kabur")
        print("Choose: ")
        val choice = scanner.nextInt()

        if (choice == 1) {
            hero.attack("Enemy")
            enemyHp -= hero.baseDamage

            if (enemyHp < 0) {
                enemyHp = 0
            }

            println("Enemy HP: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("Enemy attacks back for $enemyDamage damage!")
                hero.takeDamage(enemyDamage)
                println("${hero.name} HP: ${hero.hp}")
            }

        } else if (choice == 2) {
            println("${hero.name} kabur dari pertarungan!")
            break
        }
    }

    println("\n=== RESULT ===")
    if (hero.hp > 0 && enemyHp == 0) {
        println("${hero.name} menang!")
    } else if (hero.hp == 0) {
        println("Enemy menang!")
    } else {
        println("Battle ended.")
    }
}