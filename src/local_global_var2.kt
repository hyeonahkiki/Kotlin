
var x = 100

// 코틀린에서는전역변수와 지역변수의 이름이 중복되는 것을 허용한다.
// 이름이 중복되는 변수에 접근 할 때는
// 현재 실행되고 있는 코드와 가장 가까운 스코프에 있는 변수가 우선적으로 인식
fun main(args:Array<String>): Unit{
    val x = 30
    // 지역변수 x가 출력됨
    println(x)
    myFunc()
}

fun myFunc(){
    val x = 10
    println(x)
}