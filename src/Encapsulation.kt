fun main(args: Array<String>){
    var s = Student()
    s.setName("DAWA")
    s.setAge(22)
    println("Your name is : ${s.getName()}")
    println("Your age is : ${s.getAge()}")
}

class Student{
    private var name:String=""
    private var age:Int=0

    public fun getName():String{
        return this.name
    }
    public fun setName(name:String){
        this.name = name
    }

    public fun getAge():Int {
        return this.age
    }
    public fun setAge(age:Int){
        this.age = age
    }
}