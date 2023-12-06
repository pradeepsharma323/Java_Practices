package Interview

class HelloKotlin {

}
fun main(args: Array<String>) {
    val lst = arrayOf(5,6,8,7)
    //lst.sort()
    for (item in lst) {
        //println("Hello Kotlin $item")
    }
    var num:Int = 4;
    when(num){
        1-> println("When condition called with $num")
        2-> println("When condition called with $num")
        3-> println("When condition called with $num")
        4-> println("When condition called with $num")
    }
    var a=5;
    var b=6;
    val result = if (a>b) "$a is greater than $b" else "$b is greater than $a"
    println(result)
}