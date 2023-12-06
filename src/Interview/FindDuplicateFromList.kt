package Interview

class FindDuplicateFromList {
}

fun main(args:Array<String>){
    val list = listOf("orange", "apple", "apple", "banana", "water", "bread", "banana")
    println(list.groupingBy { it }.eachCount().filter { it.value > 1 })
}