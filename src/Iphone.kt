class Iphone (val gadget: Gadget) {

    fun checkPhone(brand: String, cpu: String, gpu: String, ram: String) {
        if (brand == "Iphone") {
            println("""
            Spek Handphone
            Brand       : $brand
            Processor   : $cpu
            Graphic     : $gpu
            Ram         : $ram
        """.trimIndent())
        } else {
            println("""
            Spek Handphone
            Brand       : $brand
            Processor   : $cpu
            Graphic     : $gpu
            Ram         : $ram
        """.trimIndent())
        }
    }
}