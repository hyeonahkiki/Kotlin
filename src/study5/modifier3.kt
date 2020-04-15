package study5

import study4.MyClass2

fun main(args:Array<String>):Unit
{
    println("$myData1")
    // 접근이 안됨. 파일안에 private로 선언되었기 때문
    //println("$myData2")

    val class1 = Myclass1()
    //val class2 = MyClass2()

    myFunc1()
    //myFunc2()
}