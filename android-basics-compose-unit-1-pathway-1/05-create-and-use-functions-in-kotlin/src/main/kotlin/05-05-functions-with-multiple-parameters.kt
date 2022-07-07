fun main() {
    println(birthdayGreeting5("John", 6))
}


fun birthdayGreeting5(name: String, age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}