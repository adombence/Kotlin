fun main() {
    val number = readLine() ?: "0"
    val parsedNumber = try {
        number.toInt()
    } catch (e: Exception) {
        0
    }

    println(parsedNumber)
}