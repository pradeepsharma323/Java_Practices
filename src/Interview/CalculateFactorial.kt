package Interview

class CalculateFactorial {
}
fun main(args: Array<String>) {
    val number = 5
    val result: Long
    //result = factorial(number)
    //println("Factorial of $number = $result")

    //

    val myLambda:(Int) -> Unit={s:Int -> println(s) }
    addNumbers(5,6, myLambda)

}

fun factorial(n: Int): Long {
    return if(n == 1){
        n.toLong()
    }
    else{
        n*factorial(n-1)
    }
}

fun addNumbers(a:Int, b:Int, myLambda:(Int) -> Unit) {
    var sum = a+b;
    myLambda(sum)
}
