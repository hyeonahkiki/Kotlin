/*
break문은 자신과 가장 가까운 반복문 하나만을 빠져나온다.
label사용법은 break@label명
label명@
 */

fun main(args:Array<String>): Unit{
    var a = 0
    var b = 0

    // 레이블 지정 : 레이블명 outer
    outer@ while(a <= 20){
        b = 0
        while(b <= 20) {
            if (a + b == 15 && a - b == 5)
                break@outer
            b += 1
        }
        a += 1
    }
    println("a: $a, b: $b")
}