fun main() {
    for (i in 1..5) {
        println("$i Hello world!")
    }

    println("Counting up, step 2")
    for (i in 0..10 step 2) {
        println(i)
    }

    println("Counting down, step 2")
    for (i in 10 downTo 0 step 2) {
        println(i)
    }
}
