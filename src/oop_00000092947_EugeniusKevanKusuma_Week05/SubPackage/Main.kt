package oop_00000092947_EugeniusKevanKusuma_Week05.SubPackage

fun main() {
    val daftarPegawai: List<Pegawai> = listOf(
        Dosen("Pak Budi"),
        Admin("Bu Sinta")
    )

    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> pegawai.mengajar()
            is Admin -> pegawai.inputData()
        }
    }

    println("\n=== MathHelper ===")

    val math = MathHelper()

    println("Luas Persegi: ${math.hitungLuas(5)}")
    println("Luas Persegi Panjang: ${math.hitungLuas(4, 6)}")
    println("Luas Lingkaran: ${math.hitungLuas(7.0)}")

    println("\n=== Payment System ===")

    val wallet = EWallet("Kevan Wallet", 50000.0)
    val card = CreditCard("Kevan Card", 100000.0)

    val payments: List<PaymentMethod> = listOf(wallet, card)

    for (payment in payments) {
        payment.processPayment(75000.0)

        if (payment is EWallet) {
            payment.topUp(50000.0)
            payment.processPayment(75000.0)
        }
    }
}