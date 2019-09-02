fun main() {
    var x = 10
    var y = 20

    x += y
    y = x - y
    x -= y

    println("X equals: $x")
    println("Y equals: $y")
}
