// 지역(Local), 전역(Global) 변수(Variable)
// scope(유효범위) : 변수가 인식될 수 있는 범위

// 전역변수 : 모든 함수에서 사용할 수 있다.
var count = 0

fun main(args:Array<String>): Unit{
    // 지역변수(블록안에 설정), 블록을 벗어나면 사라진다.
    // 즉, 블록안에서만 인식된다.
    val aa = 20
    println(aa)

    outputCount()
    println(count)
}

fun outputCount():Unit{
    println(count)
    count += 10
}