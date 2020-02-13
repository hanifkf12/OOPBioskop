import java.util.*

class Tiket(var film: FIlm, var jadwal: String, var noTiket:String){

    fun cetakTiket(){
        println("++++++++++++XXi ${film.studio.category} ++++++++++++")
        println("No Tiket : $noTiket")
        println("Judul Film : ${film.judul}")
        println("Durasi Film : ${film.durasi}")
        println("Jadwal : $jadwal")
        println("Harga : ${film.studio.price}")
        println("+++++++++++++++++++++++++++++++++++++++++++++++++++")
    }
}