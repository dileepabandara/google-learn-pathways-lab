fun main() {
    println(birthdayGreeting6(name = "Rover", age = 5))
    println(birthdayGreeting6(name = "Rex", age = 2))
}


fun birthdayGreeting6(name: String, age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting $ageGreeting"
}