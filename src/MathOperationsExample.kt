fun main() {
    print("Enter number 1: ")
    val number1 = readLine()!!.toDouble()
    print("Enter number 2: ")
    val number2 = readLine()!!.toDouble()

    val sum = number1 + number2
    println("sum: $sum")
    val sub = number1 - number2
    println("sub: $sub")
    val mul = number1 * number2
    println("mul: $mul")
    val div = number1 / number2
    println("div: $div")
}