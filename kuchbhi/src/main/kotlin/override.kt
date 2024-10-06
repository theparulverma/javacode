fun main(){
    val oneplus =Oneplus("SmartPhone")
    oneplus.display()
    println(oneplus.toString())
    //val generalMobile = mobile("General")
    //generalMobile.display()


}
open class mobile(val type:String) {
    open val name: String = " "
    open val size: Int = 5
    open fun makeCall() = println("Calling from Mobile")
    open fun powerOff() = println("Shutting Down")
    open fun display() = println("Simple Mobile Display")
}
class Oneplus(typeParam:String):mobile(typeParam) {
    override val name: String = "One Plus"
    override val size: Int = 6
    override fun display() { //=println("One Plus Display")
        super.display()
        println("One plus display")//any class is super class of every class
    }
}