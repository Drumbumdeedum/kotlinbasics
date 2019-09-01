fun main() {
    print("Please enter your name: ")
    val name = readLine()!!.toString()
    print("Please enter your age: ")
    val age = readLine()!!.toInt()
    print("Please enter your GPA: ")
    val gpa = readLine()!!.toDouble()
    println("===== User info =====")
    println("Name: $name")
    println("Age: $age")
    println("GPA: $gpa")
}