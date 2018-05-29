
fun xd() {
    println("henlo")
}

fun add(x : Int, y : Int) : Int {
    return x + y
}

fun naDruhu(cislo : Int) = cislo*cislo

fun main(args: Array<String>) {
    var pole = arrayOf(1, 2)

    for(i in pole){
        println(i)
    }

    var postupnost = 0..5
    for (a in postupnost){
        print(a)
    }

    for(b in 1 until 6){
        print(b)
    }

    var text = readLine()

    when (text){
        "text" -> println("yay")

    }



}