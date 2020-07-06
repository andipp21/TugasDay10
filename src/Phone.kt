class Phone(merk:String) : Gadget {
    override val cpu: String = "Snapdragon 845"
    override val gpu: String = "Adreno"
    override val ram: Int = 8
    override val brand: String = merk

    override fun showSpek() {
        println("""
            Spek Handphone
            Brand       : $brand
            Processor   : $cpu
            Graphic     : $gpu
            Ram         : ${ram.toString()}
        """.trimIndent())
    }

    val iphone = Iphone(this)

    fun check(){
        iphone.checkPhone(brand, cpu, gpu, ram.toString())
    }





}