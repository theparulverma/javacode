fun main(){
    var arr :Array<String> = arrayOf("One","Two","Three")
    var arr1 :Array<Int> = arrayOf(1,2,3)
    var arr2 :Array<Int> = arrayOf<Int>(3,4,5)
    for((i,e)  in arr.withIndex()){
        println("$i - $e")
    }
    println(arr[0])
    println(arr.get(1))
}