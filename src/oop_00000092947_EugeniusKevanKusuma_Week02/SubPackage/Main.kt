package oop_00000092947_EugeniusKevanKusuma_Week02.SubPackage

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("=== STUDENT REGISTRATION ===")
    println("1. Full Registration")
    println("2. Register without Major")
    print("Choose option: ")
    val choice = scanner.nextInt()
    scanner.nextLine()

    print("Enter NIM: ")
    val nim = scanner.nextLine()

    if (nim.length != 10) {
        println("Invalid NIM. Must be 10 digits.")
        return
    }

    print("Enter Name: ")
    val name = scanner.nextLine()

    val student = if (choice == 1) {
        print("Enter Major: ")
        val major = scanner.nextLine()
        Student(nim, name, major)
    } else {
        Student(nim, name)
    }

    student.displayInfo()
}