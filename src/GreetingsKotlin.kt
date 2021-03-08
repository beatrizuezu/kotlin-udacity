import java.util.*

fun main(args: Array<String>){
    val time = Calendar.getInstance()
    val message = "Good ${ if (time.get(Calendar.HOUR_OF_DAY) < 12) "morning" else "night"}, Kotlin"
    println(message)
}
