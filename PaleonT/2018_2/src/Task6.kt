fun main(args: Array<String>) {
	kss()
}

fun kss() {
	var jiddishHQ: Array<Int> = arrayOf(26, 35, 25, 68, 24, 65, 532, 2, 25, 852, 82, 285, 285, 82, 83, 83, 42, 345, 3, 453, 42, 3, 42)
	for (x in jiddishHQ) {
		if (x % 2 == 1) {
			println(x)
		}
	}
}
