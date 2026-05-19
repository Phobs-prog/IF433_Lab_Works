package oop_00000092947_EugeniusKevanKusuma_Week01.SubPackage

fun main() {
    val gameTitle = "EA FC 26"
    val price = 750000
    val finalPrice = calculateDiscount(price)

    val userNote: String? = null
    val note = userNote ?: "Tidak ada catatan"

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice,
        note = note
    )
}

fun calculateDiscount(price: Int) =
    if (price > 500000)
        price - (price * 20 / 100)
    else
        price - (price * 10 / 100)

fun printReceipt(title: String, finalPrice: Int, note: String) {
    println("=== STEAMKW RECEIPT ===")
    println("Game Title : $title")
    println("Final Price: Rp $finalPrice")
    println("Note       : $note")
}