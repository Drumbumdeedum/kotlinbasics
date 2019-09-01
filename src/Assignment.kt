fun main() {
    var x = 10
    var y = 20

    val temporary = x
    x = y
    y = temporary

    println("X equals: $x")
    println("Y equals: $y")
}