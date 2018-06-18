/*for (x in jiddishHQ){


	}*/

var jiddishHQ: Array<Int> = arrayOf(26, 35, 25, 68, 24, 65, 532, 2, 25, 852, 82, 285, 285, 82, 83, 83, 42, 345, 3, 453, 42, 3, 42)
var neparne = listOf<Int>()
var parne = listOf<Int>()


fun main(args: Array<String>) {

   for (x in jiddishHQ){
       if (x % 2 == 1) {
           neparne +=x
       }
       else{
           parne +=x
       }

   }
    println(neparne[neparne.size-2] * parne[parne.size-2])
}



