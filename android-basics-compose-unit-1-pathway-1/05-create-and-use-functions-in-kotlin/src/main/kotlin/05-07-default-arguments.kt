fun main() {
    println(birthdayGreeting7(age = 5))
    println(birthdayGreeting7(name = "Rex", age = 2))
}


fun birthdayGreeting7(name: String = "Rover", age: Int): String {
    return "Happy Birthday, $name! You are now $age years old!"
}