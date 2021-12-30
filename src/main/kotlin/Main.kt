fun main() {
//    prin(4)
//    getPrifit()
//    mengurut()
//    hitung()
//    penjumlahan(7)
//    string(" NamA Saya alex, Saya AnAk PerTama")
//fizzBuzz(100)
//fibonacci(10)
    rimuve_duplikaat_data()
}


//membalikakn angka dan di proses dengan angka
fun rimuve_duplikaat_data() {
    var x = 1234
    var temp = 0
    var result = 0
    while (x > 0) {
        temp = x % 10
        x = x / 10
        result = (result * 10) + temp

    }
    println(result)

}

//membuat deretan dengan menambahkan 2 deret sebelumnya
fun fibonacci(args: Int) {
    val n = args
    var n1 = 0
    var n2 = 1


    println("Inputan $n: ")

    for (i in 1..n) {
//        print("$t1  ")
        if (i == n) {
            println("")
            println("hasil dari deret ke $n adalah $n1")
        }
        val sum = n1 + n2
        n1 = n2
        n2 = sum


    }
}


//menampilkan apakah suatu nilai itu dizz atau buzz
fun fizzBuzz(args: Int) {
    for (i in 1..args) {

        if (i % 5 == 0 && i % 3 == 0) {
            println("Fizz Buzz")
        } else if (i % 3 == 0) {
            println("Fizz")
        } else if (i % 5 == 0) {
            println("Buzz")
        } else {
            println(i)
        }


    }
}


//mengubah format pada string
fun string(text: String) {
    println(text.lowercase())//huruf kecil semua

    println(text.toUpperCase())// kapital semua

    val hasil = text.lowercase()
    println(hasil.capitalize())// kapital

    val kata = text.lowercase()
    val words = kata.split(" ").toMutableList()
    var output = ""
    for (word in words) {
        output = output + " " + word.capitalize() + " "
        output = output.trim()
    }
    println(output)

}

//menjumlahkan nilai pada array
fun penjumlahan(args: Int) {
    val data = arrayOf(1, 7, 3, 4)
    var nilai = 0;
    var filem = ""

    for (i in 0..data.size - 1) {
        for (j in 0..data.size - 1) {
            nilai = data[i] + data[j]
            if (nilai == args) {
                filem = "${data[i]} dan ${data[j]}"
                break
            }
        }
        if (nilai == args) {
            break
        }
    }
    println(filem)
}


fun prin(args: Int) {

//    Soal Nomor 1
//    Buatlah fungsi yang dapat menghasilkan output seperti dibawah ini:

//    input n = 5
//    1**45678
//    12**5678
//    123**678
//    1234**78
//    12345**8

//    input n = 4
//    1**4567
//    12**567
//    123**67
//    1234**7

    for (i in 1..args) {
        for (j in 1..args + 3) {
            if (i + 1 == j) {
                print("*")
            } else if (i + 2 == j) {
                print("*")
            } else {
                if (j == args + 3) {
                    println("$j")
                } else {
                    print("$j")
                }
            }
        }
    }

}

fun getPrifit() {
    val data = arrayOf(10, 7, 5, 8, 11, 9, 1)

    var nilai_rendah = 0
    var nilai_tinggi = 0

    for (i in 0..data.size - 1) {
//        println(data[i])
        for (j in 0..data.size - 1) {
            if (data[j] > nilai_tinggi) {
                nilai_tinggi = data[j]
            }
            if (nilai_rendah == 0) {
                nilai_rendah = data[j]
            }
            if (data[j] < nilai_rendah) {
                nilai_rendah = data[j]
            }
        }
    }
    val hasil = nilai_tinggi - nilai_rendah
    println("$hasil ($nilai_tinggi $nilai_rendah)")
}

fun mengurut() {

//    bob = [3, 4, 6, 10, 11, 15]
//    alice = [1, 5, 8, 12, 14, 19]
//    print merge_list(bob, alice)
//    # prints [1, 3, 4, 5, 6, 8, 10, 11, 12, 14, 15, 19]

    val bob = arrayOf(3, 4, 6, 10, 11, 15)
    val alice = arrayOf(1, 5, 8, 12, 14, 19)
    var data = mutableListOf<Int>()
    var dataUrut = mutableListOf<Int>()

    data.addAll(bob)
    data.addAll(alice)
//    for (i in 0..bob.size-1) {
//        data.add(bob[i])
//    }
//
//    for (i in 0..alice.size-1) {
//        data.add(alice[i])
//    }
    var nilai_tinggi = 0
    for (i in 0..data.size - 1) {
        for (j in 0..data.size - 1) {
            if (data[j] > nilai_tinggi) {
                nilai_tinggi = data[j]
            }

        }
    }
    for (i in 0..nilai_tinggi) {

        for (j in 0..data.size - 1) {
            if (i == data[j]) {
                dataUrut.add(data[j])
            }
        }
    }

//        data.sort()

    println(dataUrut.toString())

}


fun hitung() {
//    array:
//    [1, 7, 3, 4]
//    hasilnya:
//    [84, 12, 28, 21]
//    dengan cara hitung:
//    [7 * 3 * 4, 1 * 3 * 4, 1 * 7 * 4, 1 * 7 * 3]
    val bob = arrayOf(1, 7, 3, 4)
    var hasil = mutableListOf<Int>()

    for (i in 0..bob.size - 1) {
        var data = 0
        for (j in 0..bob.size - 1) {
            if (i != j) {
                if (data == 0) {
                    data = bob[j]
                } else {
                    data = data * bob[j]
                }

            }
        }
        hasil.add(data)
    }
    println(hasil.toString())

}
