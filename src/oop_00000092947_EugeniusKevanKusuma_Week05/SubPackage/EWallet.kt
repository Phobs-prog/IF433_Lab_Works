package oop_00000092947_EugeniusKevanKusuma_Week05.SubPackage

class EWallet(
    accountName: String,
    var balance: Double
) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("$accountName berhasil membayar Rp$amount. Sisa saldo: Rp$balance")
        } else {
            println("$accountName: Saldo tidak cukup.")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("$accountName top up Rp$amount. Saldo sekarang: Rp$balance")
    }
}