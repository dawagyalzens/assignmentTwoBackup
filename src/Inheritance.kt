open class Inheritance(color: String, age: Int){
    init {
        println("Color is : $color")
        println("Age is : $age")
    }
}

class Lion(color: String, age: Int): Inheritance(color, age){
    fun roar(){
        println("Lion roars..")
    }
}

class Dog(color: String, age: Int): Inheritance(color, age){
    fun woof(){
        println("Dog woofs..")
    }
}

class Horse(color: String, age: Int): Inheritance(color, age){
    fun neigh(){
        println("Horse neighs..")
    }
}

fun main(args:Array<String>){
    val lion = Lion("Orange", 5)
    lion.roar()

    val dog = Dog("Black", 3)
    dog.woof()

    val horse = Horse("Brown", 7)
    horse.neigh()
}