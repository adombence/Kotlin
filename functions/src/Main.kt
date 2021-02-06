/*fun print10Number() {
    for (i in 1..10) {
        println(i)
    }
}*/

fun isEven(number: Int = 10): Boolean {
    return number % 2 == 0
}

/*fun Int.isOdd(): Boolean {
    return this % 2 == 1
}*/

fun main() {
    //print10Number()

    val x = isEven(number = 5)
    println(x)

    //println(y.isOdd())
}