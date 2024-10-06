import kotlin.reflect.KFunction

fun main(){
    //println(addition(1,2))
   // println(addition(1.0,2.0))
    //println(addition(a=2,b=3))
    //println(addition(b=2,a=5))
    var fn=::addition//function ko variable mein stor kara sakte hai


}
/*fun addition(a:Int,b:Int) : Int
{
 return a+b;
}*/
fun addition(a:Double,b:Double):Double
{
    return a+b;
}
