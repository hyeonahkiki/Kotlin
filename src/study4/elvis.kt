package study4

/*
 ?: => 엘비스 연산자(Elvis Operator)
 엘비스연산자 왼쪽의 피연산자가 null이 아니면 그 값을 그대로
 null이면 오른쪽 피연산자로 사용하도록 연산자
 */

fun main(args:Array<String>):Unit
{
    val aa:Int? = null
    println(aa)
    //null이면 0으로 출력아니면 그냥 aa의 값을 출력
    println(aa ?: 0)

    val bb:Int?= 20
    println(bb ?: 0)
}
/*  java의 경우
    String:str;
    return (str != null)? str: "kotlin"
 */