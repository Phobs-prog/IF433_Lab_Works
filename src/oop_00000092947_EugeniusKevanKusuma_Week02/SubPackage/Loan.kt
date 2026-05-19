package oop_00000092947_EugeniusKevanKusuma_Week02.SubPackage

class Loan(
    val bookTitle: String,
    val borrower: String,
    val loanDuration: Int = 1
) {

    fun calculateFine(): Int {
        return if (loanDuration > 3) {
            (loanDuration - 3) * 2000
        } else {
            0
        }
    }

    fun displayLoan() {
        println("=== LOAN DETAIL ===")
        println("Book Title   : $bookTitle")
        println("Borrower     : $borrower")
        println("Loan Duration: $loanDuration day(s)")
        println("Fine         : Rp ${calculateFine()}")
    }
}