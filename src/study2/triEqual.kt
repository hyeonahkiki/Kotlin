package study2

// ===(두 참조변수가 같은 객체를 가리키고 있는지
// 여부를 조사하는 연산자) ,
// !== 연산자
// ==, !=

fun main(args:Array<String>): Unit{
    var a = "first"
    var b = "first"

    // 두 참조변수가 같은 객체를 참조할 경우 : ture 리턴
    println(a === b)

    b = "fir"
    b += "st"
    println(a===b)

    b = a
    println(a === b)
}