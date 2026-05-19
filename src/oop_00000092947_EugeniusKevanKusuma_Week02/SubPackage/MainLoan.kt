package oop_00000092947_EugeniusKevanKusuma_Week02.SubPackage

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter book title: ")
    val title = scanner.nextLine()

    print("Enter borrower name: ")
    val borrower = scanner.nextLine()

    print("Enter loan duration: ")
    var duration = scanner.nextInt()

    if (duration < 0) {
        duration = 1
    }

    val loan = Loan(title, borrower, duration)
    loan.displayLoan()
}