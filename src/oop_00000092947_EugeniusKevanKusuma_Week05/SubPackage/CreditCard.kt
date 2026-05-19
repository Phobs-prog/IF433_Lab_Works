package oop_00000092947_EugeniusKevanKusuma_Week05.SubPackage

class CreditCard(
    accountName: String,
    val limit: Double
) : PaymentMethod(accountName) {

    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("$accountName berhasil membayar Rp$amount. Terpakai: Rp$usedAmount")
        } else {
            println("$accountName: Transaksi ditolak, melebihi limit.")
        }
    }
}