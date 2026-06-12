package oop_00000092947_EugeniusKevanKusuma_Wekk09.SubPackage

data class Student(

    val name: String,
    val score: Int

)

fun main() {

    val students = listOf(

        Student("Kevin", 90),
        Student("Maria", 70),
        Student("John", 85),
        Student("Alice", 60),
        Student("Bob", 95)

    )

    val result = students

        .filter {

            it.score >= 75

        }

        .sortedBy {

            it.name

        }

        .map {

            "${it.name} : ${it.score}"

        }

    result.forEach {

        println(it)

    }

}