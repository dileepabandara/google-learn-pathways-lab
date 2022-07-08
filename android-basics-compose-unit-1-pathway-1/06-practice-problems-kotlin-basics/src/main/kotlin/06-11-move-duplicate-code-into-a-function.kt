fun main() {
    displayWeather(city = "Ankara", low = 27, high = 31, chanceOfRain = 82)
    displayWeather(city = "Tokyo", low = 32, high = 36, chanceOfRain = 10)
    displayWeather(city = "Cape Town", low = 59, high = 64, chanceOfRain = 2)
    displayWeather(city = "Guatemala City", low = 50, high = 55, chanceOfRain = 7)
}

fun displayWeather(city: String, low: Int, high: Int, chanceOfRain: Int) {
    println("City: $city")
    println("Low temperature: $low, High temperature: $high")
    println("Chance of rain: $chanceOfRain%")
    println()
}