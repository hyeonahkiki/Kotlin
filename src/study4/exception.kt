package study4

/*
 예외(Exception) : 프로그램 실행 중에 예상치 못했던 문제가 발생하는 상황
 예외가 발생하면 프로그램은 오류 메세지를 출력하면서 강제로 종료된다.
 예외처리를 하면 프로그램이 강제로 종료되는 것을 막아줌
 */

fun main(args:Array<String>):Unit{
    val str = "hello"
    //to.Int() : 문자열을 Int형으로 바꾼다
    // 문자열로 들어온 문자를 숫자로 바꿀 수는 없음 => 오류 발생
    val num = str.toInt()

    println(num)
}
