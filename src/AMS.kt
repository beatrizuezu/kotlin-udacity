import kotlin.random.Random

fun feedTheFish(){
    val day = randomDay()
    val food = "pellets"
    println("Today is $day and the fish eats $food")
}
fun randomDay() : String{
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random.nextInt(7)]
}
fun main(args: Array<String>){
    println("Hello, ${args[0]}")
    feedTheFish()

}