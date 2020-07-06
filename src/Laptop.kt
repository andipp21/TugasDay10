class Laptop: Gadget {
    override val cpu: String = "Intel i3"
    override val gpu: String = "Nvidia"
    override val ram: Int = 8
    override val brand: String = "Lenovo"

    override fun showSpek() {
        println("""
            Brand       : $brand
            Processor   : $cpu
            Graphic     : $gpu
            Ram         : $ram
        """.trimIndent())
    }
}