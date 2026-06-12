package oop_00000092947_EugeniusKevanKusuma_Wekk09.SubPackage

fun main() {

    val greet = { name: String ->
        println("Hello $name")
    }

    greet("Kevin")

    val square = { number: Int ->
        number * number
    }

    println(square(5))

    val names = listOf(
        "Kevin",
        "John",
        "Maria"
    )

    names.forEach {

        println(it)

    }

}