open class Komputer {
    val layar:String = "1080P IPS Panel"
    val speaker:String = "Dolby Atmos"

    private val laptop: Laptop = Laptop()
    fun lenovo(){
        println("Lenovo memiliki spek : ")
        laptop.showSpek()
        println("Layar       : $layar")
        println("Speaker     : $speaker")
    }
}