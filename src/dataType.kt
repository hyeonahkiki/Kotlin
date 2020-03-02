// 정수타입 :
// Byte(1바이트) : -128~127
// Short(2바이트) : - 3만2768 ~ 3만 2767
// Int(4바이트) : -21억 4748만 3648 ~ 21억 4748만 3648
// Long(8바이트)

//실수타입 : 저장가능 범위보가 아니라 소수점의 정밀도
// Float(4바이트)
// Double(8바이트)

fun main(args: Array<String>): Unit{
    val a: Byte = 125
    val b: Short = (10+1000) * 10
    // 단위가 길어지면 _를 쓰기도 한다
    var cc: Int = 1_000_000_000
    //16진수 표현
    cc = 0xFF_AA__77
    // 2진수 표현
    cc = 0b10101010_01110111
    // 더 많은 범위의 숫자 표현 가능
    var d: Long = 233_344_456_789

    cc = a + b // Byte + Short = Int
    d = cc + 10L
    // 45.4가 더블로 인식되 저장안될 수 있음
    //Float타입은 리터럴 뒤에 f, F를 덧붙인다.
    var ee:Float = 45.4f

    // 45.34를 Double인식. 코틀린에서 기본 소수점은 더블로 인식
    val dd:Double = 45.34

    //toFloat() : float로 변환
    ee = (ee + dd).toFloat()
    println(ee)

    println(0.1f + 0.1f + 0.1f + 0.1f + 0.1f)
    // 0.1f = 0.10001491... 무한소수로 표현된다.
    // 누적되는 거에 따라 값이 달라질 수 있다.

    println(0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f)

    println(0.1 * 10)
}