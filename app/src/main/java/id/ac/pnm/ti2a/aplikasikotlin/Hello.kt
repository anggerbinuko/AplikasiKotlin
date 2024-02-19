package id.ac.pnm.ti2a.aplikasikotlin

fun main(args: Array<String>) {
    biodata("Angger")
    hobby("mancing","saya suka mancing keributan")
}

fun biodata(nama: String, kelas:String = "2A"){ // minimal 2 parameter/args
    val biodata = """
        nama = $nama
        kelas = $kelas 
    """
    print(biodata)
}

fun hobby(nama:String, desc:String){ // 2 parameter
    println("hobby = $nama")
    println(desc)

}

