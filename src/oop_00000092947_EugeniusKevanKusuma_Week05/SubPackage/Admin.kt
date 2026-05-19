package oop_00000092947_EugeniusKevanKusuma_Week05.SubPackage

class Admin(
    nama: String
) : Pegawai(nama) {

    override fun bekerja() {
        println("$nama sedang mengurus administrasi kampus.")
    }

    fun inputData() {
        println("$nama sedang menginput data mahasiswa.")
    }
}