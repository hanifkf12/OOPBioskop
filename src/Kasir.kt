class Kasir(var idTransaksi:String, var tiket: MutableList<Tiket>){
    var randomString = "TIKET-$idTransaksi"
    private var totalharga = 0.0
    fun inputBeli(t: Tiket){
        t.film.studio.ambilKursi()
        tiket.add(t)
    }
    fun konfirmasi(){
        println("Judul film ${tiket[0].film.judul}")
        println("Jumlah TIker ${tiket.size} tiket")
    }
    fun checkOut(){
        println("============XXI============")
        println("No Transaksi : $randomString")
        for (i in tiket){
            i.cetakTiket()
            totalharga += i.film.studio.price
        }
        println("TOtal Harga : $totalharga")

    }
}