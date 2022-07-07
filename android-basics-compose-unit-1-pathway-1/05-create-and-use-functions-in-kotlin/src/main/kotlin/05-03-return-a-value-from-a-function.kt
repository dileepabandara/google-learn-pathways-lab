fun main() {
    birthdayGreeting2()
    val greeting = birthdayGreeting3()
    println(greeting)
    println(birthdayGreeting3())
}

// Unit means the function doesn't return a value

fun birthdayGreeting2(): Unit {
    println("Happy Birthday, Rover!")
    println("You are now 5 years old!")
}

fun birthdayGreeting3(): String {
    val nameGreeting = "Happy Birthday, Rover!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}