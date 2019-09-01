fun main() {
    val str1: String
    str1 = "Daniel, Welcome to Kotlin!"
    val str2 = "Daniel, Welcome to Kotlin!"
    println(str1)
    println(str2)

    val name = "Daniel Szalay"
    val age = 30
    val gpa = 3.8
    println("===== User info =====")
    println("Name: $name")
    println("Age: $age")
    println("GPA: $gpa")

    var firstName = "Daniel"
    println(firstName)
    firstName = "Petra"
    println(firstName)

    var department: String?
    department = null
    println("Department: ${department!!}")
}
