/*
반복문(while)
while(Boolean 표현식)
{
    실행시킬 코드(Boolean 표현식이 참일 동안 실행되는 코드)
}
*/

fun main(args:Array<String>): Unit{
    var i = 1

    while (i < 10){
        i += 1
        println(i)
    }
    println("끝!!")
}