fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val resultAdd = add(firstNumber, secondNumber)
    val anotherResultAdd = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $resultAdd")
    println("$firstNumber + $thirdNumber = $anotherResultAdd")

    val resultSub = subtract(firstNumber, secondNumber)
    val anotherResultSub = subtract(firstNumber, thirdNumber)

    println("$firstNumber - $secondNumber = $resultSub")
    println("$firstNumber - $thirdNumber = $anotherResultSub")
}

fun add(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber + secondNumber
}

fun subtract(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber - secondNumber
}