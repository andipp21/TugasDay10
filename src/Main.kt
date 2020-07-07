fun main() {
    val komputer = Komputer()

    komputer.lenovo()

    val phone = Phone("Samsung")

    phone.check()

    //pendeklarasian dengan function arrayOf()
    val listData = arrayOf("data1", "data2", "data3")
    for (i in listData.indices) {
        println(listData[i])
    }

    //pendeklarasian dengan lambda expression
    val kelipatan2 = Array(5) { it * 2 }
    for (i in kelipatan2.indices) {
        print(kelipatan2[i])
    }
    //5 menunjukan panjang data, it merupakan indexnya yang di eksekusi.

    println("")


    //2d inputan manual/dinamis
    val matrix = Array(3) { IntArray(3) }

    var num = 1

    for (i in matrix.indices) {
        val colArray = IntArray(3)
        for (j in colArray.indices) {
            colArray[j] = num++
        }
        matrix[i] = colArray
    }

    for (colArray in matrix) {
        for (j in colArray) {
            print(j)
            print(" ")
        }
        println("")
    }

    //2d inputan statis
    val arr = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))

    for (i in 0..2) {
        for (j in 0..2) {
            print(arr[i][j].toString() + " ")
        }
        println()
    }

    //3d sudah ada inputan data
    val arr2 = arrayOf(arrayOf(intArrayOf(1, 2), intArrayOf(3, 4)), arrayOf(intArrayOf(5, 6), intArrayOf(7, 8)))

    //val arr[matrik][row][col]

    for (i in 0..1) {
        for (j in 0..1) {
            for (k in 0..1) {
                print(arr2[i][j][k].toString() + " ")
            }
            println()
        }
        println()
    }

    //3d auto inputan manual
    val matrix2 = Array(2) { Array(3) { IntArray(3) } }

    var num2 = 1

    for (i in matrix2.indices) {
        val row = Array(3) { IntArray(3) }
        for (j in row.indices) {
            val col = IntArray(3)
            for (k in col.indices) {
                col[k] = num2++
            }
            row[j] = col
        }
        matrix2[i] = row
    }

    for (row in matrix2) {
        for (col in row) {
            for (k in col) {
                print(k)
                print(" ")
            }
            println("")
        }
        println("")
    }
}
