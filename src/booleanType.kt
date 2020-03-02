//boolean : 참과 거짓을 표현하는 타입
/* 비교연산자 :
== : a ==b(a와 b가 같으면 true, 다르면 false)
!= : a != b(a와 b가 다르면 true, 같으면 false)
>, <, >=, <= : a> b, a < b, a>=b, a<=b
*/

fun main(args:Array<String>):Unit{
    var isTrue:Boolean = 199 > (3 * 30)
    println(isTrue)

    isTrue = false
    println(isTrue)

    val a = 100
    val b = 200
    isTrue = a > b
    println(isTrue)

    isTrue = a==b
    println(isTrue)

}