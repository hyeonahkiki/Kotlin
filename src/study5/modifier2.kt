package study5

val myData1: Int = 100

// 같은 파일 내에서 접근이 가능
private val myData2: String = "Hello"

class Myclass1(){}

private class Myclass2(){}

fun myFunc1(){
    println("myFunc1() 호출....")
}
private fun myFunc2(){
    println("myFunc2() 호출.....")
}

fun main(args:Array<String>):Unit
{
    println("$myData1...")
    println("$myData2.....")

    val class1 = Myclass1()
    val class2 = Myclass2()

    // 함수는 호출이 접근
    myFunc1()
    myFunc2()
}