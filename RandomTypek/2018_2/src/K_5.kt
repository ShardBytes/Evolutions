import java.util.*

fun parne(x : Int, y : Int){
	for(i in x..y){
		if(i%2 == 0){
			println(i)
		}

	}
}

fun main(args: Array<String>) {
	var scanner = Scanner(System.`in`)
	println("od: ")
	var od : Int = scanner.nextInt()
	println("do: ")
	var doooo : Int = scanner.nextInt()
	parne(od, doooo)
}