fun main(){
    //val ob = Calculator()//make an object of type calculator type
    //println(ob.add(2,3))
    val p1 = Person("cheezy",21)
    println(p1.age)
    p1.age = 23
    p1.age = -12
    println(p1.name)

}
class Person(nameParam:String,ageParam:Int){
    var name:String = nameParam
        get(){
            println("Name getter")
            return field.toUpperCase()
        }
    var age:Int = ageParam
        set(value){
            if(value>0){
                field = value
            }
            else{
                println("Age can't be negative")
            }
        }
}
/*class Calculator{//class hai yeh without any constructor
    lateinit var message:String
    //var message:String//to avoid run time error that why kotlin is used and properties ko initialize value dete h
    fun add(a:Int,b:Int):Int{
        return a+b
    }
    fun multiply(a: Int,b:Int) :Int{
        return a*b
    }
}*/