import java.util.*

fun main(args: Array<String>) {
	var hgi = arrayOf("David", "Druhý david")
	var random : Random = Random()
	print(hgi[random.nextInt(2)])
}