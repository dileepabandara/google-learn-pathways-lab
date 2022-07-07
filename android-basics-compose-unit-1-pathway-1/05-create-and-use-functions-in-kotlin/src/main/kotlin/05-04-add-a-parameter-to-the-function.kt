fun main() {
    println(birthdayGreeting4("Rover"))
    println(birthdayGreeting4("Rex"))
}


fun birthdayGreeting4(name: String): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}