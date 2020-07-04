class Laptop: Gadget {
    override val cpu: String = "Intel i3"
    override val gpu: String = "Nvidia"
    override val ram: Int = 8

    override fun showSpek() {
        println("""
            Processor   : $cpu
            Graphic     : $gpu
            Ram         : $ram
        """.trimIndent())
    }
}