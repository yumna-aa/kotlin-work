// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {

    if (args.size != 3) {
        println("Please provide three arguments")
        return
    }

    var initialTemp = args[0].toDouble()
    val maxTemp = args[1].toDouble()
    val incr = args[2].toDouble()



    while(initialTemp <= maxTemp){
        val farenheit = (initialTemp * 9/5 + 32)
        println("$initialTemp%.1f C = $farenheit%.1f F")
        initialTemp += incr

    
    }
}
