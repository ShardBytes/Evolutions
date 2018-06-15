fun main(args: Array<String>) {
	var janeviemus = arrayOf(4, 8, 4, 5464, 78, 468411, 46846686868, 4687782212, 11111111, 468, 9, 47, 222, 101, 747, 999)
	var sucet : Long = 0

	for(i in janeviemus){
		print("$i, ")
		sucet += i
	}

	print("Súčet: $sucet")
}