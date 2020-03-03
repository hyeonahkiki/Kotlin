// 디폴트 인수를 갖는 함수(매개변수가 기본값을 갖는 함수)

fun main(args:Array<String>): Unit{
   val avg = getAvg(77,88)
    println(avg)
    val avg2 = getAvg(77,88,true)
    println(avg2)

    val avg3 = getAvg()
    println(avg3)

    // 매개변수의 순서는 바꿀 수 있다.
    val avg4 = getAvg(print=true, a=20, b=30)
    print(avg4)
}

// 이름이 같더라도 매개변수가 다르면 에러나지 않는다.
fun getAvg(a:Int=0, b:Int=0, print:Boolean = false):Double{
    val res = (a+b)/2.0
    if (print)
        println(res)
    return res
}

