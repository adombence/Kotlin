abstract class Animal(name: String, val legCount: Int = 4) {
    init {
        println("Hello my name is $name")
    }

    abstract fun makeSound()
}

