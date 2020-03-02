//코틀린에서는 삼항연산자가 없다.
// 삼항 연산자는 if 표현식으로 해결된다.

fun main(args:Array<String>):Unit{
    val a = 5
    val result = if(a > 10) "Hello" else "World"
    println(result)
}