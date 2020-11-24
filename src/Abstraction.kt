abstract class student(name : String, age : Int){
    init {
        println("Student name is : $name")
        println("Student age is : $age")
    }

    //non-abstract function
    fun nonAb(){
        println("This is non-abstract function of an abstract class.")
    }

    //abstract function
    abstract fun abFunc(message : String)
}

class Abstraction(name: String, age: Int): student(name, age){
    override fun abFunc(message: String) {
        println(message)
    }
}

fun main(args: Array<String>){
    println("Enter your name : ")
    val _name = readLine()!!.toString()
    println("Enter your age : ")
    val _age = readLine()!!.toInt()
    println("Enter your message : ")
    val msg = readLine()!!.toString()

    val obj = Abstraction("$_name", _age)
    obj.abFunc("$msg")
    obj.nonAb()
}