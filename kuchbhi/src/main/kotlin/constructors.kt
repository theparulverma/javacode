fun main() {
    var car = Automobile("Car",4,5,"Petrol")//yaha automobile name ke class ka object car banaya hai humne
    var car2 =Automobile("Car2",4,5,"Petrol")
    /*var person = Person("A",20)
    println(person.age)
    println(person.name)
    var person2 = Person("B",15)
    println(person2.age)
    println(person2.name)*/
}
class Automobile(val name: String,val tyres:Int,val maxSeating: Int,val engineType: String){
    init{
        println("$name is created")//yeh jo main mein variable bana hainaa car voh print hoga name ke jagah pe
    }
    //var airbags = hasAirBags
    init{
        println("2nd Initializer Block")
    }
    constructor(nameParam: String,engineParam: String)://rule of constructor whenever we make secondary constructor we need to call primary constructor
            this(nameParam, 4,5,engineParam)
    fun drive(){}
    fun applyBrakes(){}
}
/*class Empty{}

class Person(nameParam:String, ageParam:Int)// constructor define
{
    val name:String = "$nameParam.Clan"
    var age:Int = ageParam

}*/

