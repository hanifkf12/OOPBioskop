fun main(){
    var studio1 = Studio(20,45000.0, "Biasa")
    var studio2 = Studio(20,65000.0, "Premiere")

    var film1 = FIlm("Spiderman 3",132,"Action",studio1)
    var film2 = FIlm("Superman 3",110,"Action",studio2)

    val films = listOf<FIlm>(film1,film2)

    var tikets = mutableListOf<Tiket>()
    var input : Int
    do {
        println("=================XXI TICKET=================")
        if (!tikets.isEmpty()){
            println("Terdapat ${tikets.size} Pesanan")
        }
        println("Pilih Menu : ")
        println("1. Beli Tiket")
        println("2. CcheckOut")
        println("3. Batal Pesan")
        println("4. Keluar")
        print("Masukan Pilihan : ")
        input = readLine()!!.toInt()
        println()
        when(input){
            1-> {
                films.forEachIndexed { index, film ->
                    println("${index+1}. ${film.toString()}")
                }
                print("Pilih Film : ")
                var inputFIlm = readLine()!!.toInt()
                print("Jumlah : ")
                var inputJumlah = readLine()!!.toInt()
                for(i in 0 until inputJumlah){
                    tikets.add(Tiket(films[inputFIlm-1],"Malam",(i+1).toString()))
                }

            }
            2->{
                val kasir = Kasir("trx1",tikets)
                kasir.konfirmasi()
                println("Apakah Benar ? (Y/N)")
                var pilih = readLine()!!
                if(pilih.equals("y",ignoreCase = true)){
                    kasir.checkOut()
                    tikets.clear()
                }else{
                    print("Oke")
                }
            }
        }
    }while (input!=4)

}