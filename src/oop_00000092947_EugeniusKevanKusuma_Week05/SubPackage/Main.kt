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
}