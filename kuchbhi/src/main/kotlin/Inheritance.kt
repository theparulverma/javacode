fun main(){
    val objChild = child()
    objChild.myMethod()
    objChild.MyMethod2()

}
open class Parent//pehle parent banega then child
{
    val name:String =" "
    fun myMethod(){
        println("I am in Parent")
    }
}
class child :Parent(){
    val name2 : String =" "
    fun MyMethod2(){
        println("I am in child")
    }
}