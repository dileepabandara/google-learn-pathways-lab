fun main() {
    val steps = 4000
    val caloriesBurned = pedometerStepsToCalories(steps);
    println("Walking $steps steps burns $caloriesBurned calories")
}

fun pedometerStepsToCalories(NumberOFStepS: Int): Double {
    val caloriesBurnedForEachStep = 0.04
//    val totalCaloriesBurned = NumberOFStepS * caloriesBurnedForEachStep
//    return totalCaloriesBurned
    return NumberOFStepS * caloriesBurnedForEachStep
}