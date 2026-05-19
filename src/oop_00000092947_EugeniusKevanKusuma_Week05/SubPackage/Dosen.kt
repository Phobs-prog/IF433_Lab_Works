package oop_00000092947_EugeniusKevanKusuma_Week05.SubPackage

class Dosen(
    nama: String
) : Pegawai(nama) {

    override fun bekerja() {
        println("$nama sedang mengajar di kelas.")
    }

    fun mengajar() {
        println("$nama menjelaskan materi OOP.")
    }
}