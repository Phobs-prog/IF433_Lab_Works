package oop_00000092947_EugeniusKevanKusuma_Week02.SubPackage

class Student(
    val nim: String,
    val name: String,
    var major: String,
    val gpa: Double = 0.0
) {

    init {
        if (nim.length != 10) {
            println("WARNING: NIM tidak valid!")
        }
    }

    constructor(nim: String, name: String) : this(
        nim,
        name,
        "Non-Matriculated"
    )

    fun displayInfo() {
        println("=== STUDENT INFO ===")
        println("NIM   : $nim")
        println("Name  : $name")
        println("Major : $major")
        println("GPA   : $gpa")
    }
}