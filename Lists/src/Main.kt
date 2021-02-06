fun main() {
    val shoppingList = mutableListOf("Lamborghini", "Penthouse", "Rolex")
    shoppingList.add("Ferrari")

    //while loop
    var counter = 0
    while (counter < shoppingList.size) {
        println(shoppingList[counter])
        counter++
    }

    println("--------")

    //for loop
    for (i in 1..100) {
        println(i)
    }

    //short for loop
    for (shoppingItem in shoppingList) {
        println(shoppingItem)
    }
}