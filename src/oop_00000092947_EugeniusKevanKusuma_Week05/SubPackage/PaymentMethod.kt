package oop_00000092947_EugeniusKevanKusuma_Week05.SubPackage

abstract class PaymentMethod(
    val accountName: String
) {
    abstract fun processPayment(amount: Double)
}