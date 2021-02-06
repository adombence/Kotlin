fun main() {
    val dog = Dog()
    dog.makeSound()
    val cat = Cat()
    cat.makeSound()

    val bear = object : Animal("Camembear") {
        override fun makeSound() {
            println("roar!!!".toUpperCase())
        }
    }

    bear.makeSound()
}