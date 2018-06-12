import java.util.*

fun main(args: Array<String>) {
	var jew = Scanner(System.`in`)
	oneechan(jew.nextInt(),jew.nextInt())


}

fun oneechan( foku:Int , me:Int) {
	var auschwits = foku
	while(auschwits<me){
		if(auschwits%2 == 0)
			println(auschwits)
		auschwits++
	}
}