
fun main(args: Array<String>) {
	var tabulka = listOf(47, 5, 14, 3, 56, 420, 69, 123, 465668, 777)
	var tabulkaParne = listOf<Int>()
	var tabulkaNeparne = listOf<Int>()

	for(i in tabulka){
		if(i%2 == 0){
			tabulkaParne += i
		} else {
			tabulkaNeparne += i
		}
	}

	println(tabulkaParne[tabulkaParne.size-2] * tabulkaNeparne[tabulkaNeparne.size-2])
}