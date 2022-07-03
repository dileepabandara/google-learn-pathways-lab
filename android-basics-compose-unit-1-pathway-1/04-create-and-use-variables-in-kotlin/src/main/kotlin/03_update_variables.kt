fun main() {

//    val keyword - Use when you expect the variable value will not change.
//    var keyword - Use when you expect the variable value can change.

    var cartTotal = 0
    println("Total: $cartTotal")

    cartTotal = 20
    println("Total: $cartTotal")

    var count = 10
    println("You have $count unread messages.")
    // count = count + 1
    // count += 1
    count++
    println("You have $count unread messages.")
    count--
    println("You have $count unread messages.")
}