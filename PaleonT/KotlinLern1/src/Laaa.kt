
var x = 1
fun skuska (pocet:Int){
	var poce = pocet
	for(i in 1..poce){
		for (c in 1 .. i){
			print("\n $x")
		}

		x++


	}
}

fun main(args: Array<String>) {
	skuska(5)
}