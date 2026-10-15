// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Please provide one argument")
        return
    }

    val n = args[0].toInt()
    var sum = 0

    for (i in 1..n) {
        sum += i 
    }
    println("Sum = $sum")
    
}
