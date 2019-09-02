import java.util.*

fun main() {
    print("Enter your year of birth: ")
    val yob = readLine()!!.toInt()
    val currentYear = Calendar.getInstance().get(Calendar.YEAR)
    val age = currentYear - yob

    print("You are $age years old!")
}
