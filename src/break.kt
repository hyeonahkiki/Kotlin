/*
break문
: 반복문을 실행하다가 아예 반복문을 빠져나온다.
 */

fun main(args:Array<String>):Unit{
    var i = 0
    while(true){
        i+= 1
        if (i >10) break
        println(i)
    }
}