package study4

import java.lang.Exception

// 예외는 기본적으로 시스템에서 의해서 발생한다.
// 사용자가 고의로 예외를 발생시킬 수 있다. 이때 '예외를 던진다'라고한다.

fun main(args:Array<String>):Unit
{
    try{
        callDiv()
    }catch(e:Exception){
        println(e.message)
}
}
fun callDiv()
{
    val aa = 10
    val bb = 0
    div(aa, bb)
}
/*
    예외를 던질 때 형식
    throw Throwable 타입 표현식

    Exception은 Throwable을 상속받는다.
 */


fun div(a:Int, b:Int):Int
{
    if(b==0)
        // 예외를 던진다 => 예외를 발생시킨다.
        // div-> callDiv->main(시스템에서 처리)
        throw Exception("0으로 나눌 수 없습니다.")
    return a/b
}
