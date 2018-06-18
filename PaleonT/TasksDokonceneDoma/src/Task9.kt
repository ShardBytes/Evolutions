var yesnt: Array<Int> = arrayOf(26, 35, 25, 68, 24, 65, 532, 2, 25, 852, 82, 285, 285, 82, 83, 83, 42, 345, 3, 453, 42, 3, 42)
fun main(args: Array<String>) {
    var q =0
    for (x in yesnt)
        print("$x ")
    for (x in yesnt){
        q += x
    }
    println("\n$q")
}