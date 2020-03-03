/*
함수 : 명렁어들을 담은 상자
 */

// fun 함수명(인자, 파라미터, 매개변수):반환타입
// main은 만들 수 없다. os에서 불러다 쓰는 함수
fun main(args:Array<String>):Unit{
    println(myFun())
}
// 인자(파라미터, 매개변수)가 없는 함수
fun myFun():Int{
    val a = 10
    val b = 11
    println("a:"+a+", b:"+b)
    return a + b
}