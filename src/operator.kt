fun main(args: Array<String>):Unit{
    //산술연산자(+, -, *, /, %)
//    val num: Double = 10.0 + 20 - 27
    val num: Int = 10 + 20 - 27
    val num2: Int = 200 % 3

    // Double 실수
    // 실수와 정수를 계산하게 되면 실수가 된다
    val num3: Double = 7.5 /5 + 11.1

    // 정수와 정수타입을 계산하면 정수가 나온다.
    // num이 정수형 타입인데 toDouble()함수를 이용해서
    //더블로 바꿀 수 있음
    // 코틀린은 타입체크가 엄격하다
    val num4: Double = num.toDouble()/num2 + 0.3
    println(num)
    println(num2)
    println(num3)
    println(num4)

    //증감 연산자(++, --)
    var aa = 10
    var bb = 5
    println(aa++ + bb) // ++후위 연산
    println(aa) // ++ (aa + 1)
    println()
    println(++aa + bb) // (1+aa) = ++aa 전위연산
    println(--bb)
}