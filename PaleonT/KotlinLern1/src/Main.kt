fun add(a : Int, b : Int) = a + b

fun main(args: Array<String>) {
    println(add(23,46))

    var addLambda = { a : Int, b : Int -> a + b }
    println(addLambda(23,46))
}