package oop_00000092947_EugeniusKevanKusuma_Week12.SubPackage

fun main() {

    // try-catch-finally dasar

    try {

        val result = 10 / 0
        println(result)

    } catch (e: ArithmeticException) {

        println("Terjadi error: ${e.message}")

    } finally {

        println("Program selesai dijalankan.")

    }

    // try sebagai expression

    val value = try {

        20 / 2

    } catch (e: ArithmeticException) {

        -1

    }

    println("Hasil: $value")

}