fun neparne(x : Array<Int>){
	for(i in x){
		if(i%2 == 1){
			println(i)
		}

	}
}

fun main(args: Array<String>) {
	var tabulka : Array<Int> = arrayOf(1, 5, 800, 9, 3, 420, 69, 911)
	neparne(tabulka)
}