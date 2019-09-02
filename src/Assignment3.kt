fun main() {
    print("Enter a number: ")
    val input = readLine()!!.toInt()

    if(input % 2 == 0) {
        print("$input is an even number!")
    } else {
        print("$input is an odd number!")
    }
}
