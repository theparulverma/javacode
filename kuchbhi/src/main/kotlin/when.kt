fun main(){
    val animal = "Dog"
    /*when(animal){
        "Horse" -> println("animal is horse")
        "cat" -> println("animal is cat")
        "dog" -> println("animal is dog" )
        else -> println("animal not found")*/
    val result = when(animal){
        "horse" -> "animal is horse"
        "cat" -> "animal is cat"
        "dog" -> "animal is dog"
        else -> "animal not found"
    }
    println(result)
}