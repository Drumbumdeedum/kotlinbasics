fun main() {
    print("Enter your age: ")
    val age = readLine()!!.toInt()

    // IF scenario
    if(age < 0) {
        println("You are clearly lying!")
    } else if(age == 0) {
        println("Hello, world!")
    } else if(age in 1..17) {
        println("Ahh, some wonderful years ahead!")
    } else if(age in 18..30) {
        println("There is still hope for you!")
    } else if(age in 31..60) {
        println("Well you are almost done here!")
    } else {
        println("You're an old geezer!")
    }

    // WHEN scenario
    when {
        age < 0 -> println("You are clearly lying!")
        age == 0 -> println("Hello, world!")
        age in 1..17 -> println("Ahh, some wonderful years ahead!")
        age in 18..30 -> println("There is still hope for you!")
        age in 31..60 -> println("Well you are almost done here!")
        else -> println("You're an old geezer!")
    }
}
