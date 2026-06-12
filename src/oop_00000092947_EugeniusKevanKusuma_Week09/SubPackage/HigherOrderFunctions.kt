package oop_00000092947_EugeniusKevanKusuma_Wekk09.SubPackage

fun main() {

    val numbers = listOf(
        10,
        5,
        8,
        25,
        2,
        30,
        15
    )

    val filtered = numbers.filter {

        it >= 10

    }

    println(filtered)

    val mapped = filtered.map {

        it * 2

    }

    println(mapped)

    mapped
        .sortedByDescending {

            it

        }
        .forEach {

            println(it)

        }

}