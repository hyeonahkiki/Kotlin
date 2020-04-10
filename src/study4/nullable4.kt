package study4


// ?. (safe call operator) : 안전한 호출 연산자

// 일반적인 프로그래밍에서는 if else문을 이용해서 null확인을한다.
// 코틀린에서는 손쉽게 null 확인 하기 위한 연산자를 제공하고 있다.

fun main(args:Array<String>):Unit
{
    var data1:String? = "kotlin"

    var len:Int? = data1?.length
    println(len)

    data1 = null
    len = data1?.length
    println(len)
}