class FIlm(var judul: String, var durasi: Int, var kategori:String, var studio: Studio){

    override fun toString(): String {
        return "FIlm(judul='$judul', durasi=$durasi, kategori='$kategori', studio=${studio.category}, harga : ${studio.price})"
    }
}