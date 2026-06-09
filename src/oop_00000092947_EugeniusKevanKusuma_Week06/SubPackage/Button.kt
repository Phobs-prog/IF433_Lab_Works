package oop_00000092947_EugeniusKevanKusuma_Week06.SubPackage

class Button(
    override val name: String
) : Clickable {

    override fun click() {
        println("$name ditekan.")
    }
}
