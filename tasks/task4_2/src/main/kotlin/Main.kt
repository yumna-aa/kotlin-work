// Task 4.2: use of if and ranges

fun main() {
    println("""
    
    PIZZA MENU

    (a) Margherita
    (b) Quattro Stagioni
    (c) Seafood
    (d) Hawaiian

    Choose your pizza (a-d):
    """)

    val input = readln().lowercase()

    if (input.length == 1 && input[0] in 'a'..'d') {
        println("Order accepted")
    } else {
        println("Invalid choice!")
    }

}
