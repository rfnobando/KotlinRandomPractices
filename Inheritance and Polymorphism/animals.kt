open class Animal(
    val name: String = "Unknown",
    val age: Int = -1
) {
    open val type = "Unknown"
    
    open fun callMyOwner() {
        println("This animal is not defined")
    }
    
    fun showAnimalDescription() {
        println("Type: $type")
        println("Name: $name")
        
        when(age) {
            -1 -> println("Age: Unknown")
            else -> println("Age: $age")
        }
    }
}

class Cat(name: String, age: Int) : Animal(name, age) {
    override val type = "Cat"
    override fun callMyOwner() {
        println("Meow!")
    }
}

class Dog(name: String, age: Int) : Animal(name, age) {
    override val type = "Dog"
    override fun callMyOwner() {
        println("Wof! Wof!")
    }
}

fun main() {
    val catOne = Cat(name = "Anubis", age = 5)
    catOne.showAnimalDescription()
    catOne.callMyOwner()
    
    println()
    
    val dogOne = Dog(name = "Tobi", age = 7)
    dogOne.showAnimalDescription()
    dogOne.callMyOwner()
    
    println()
    
    val animal = Animal()
    animal.showAnimalDescription()
    animal.callMyOwner()
}
