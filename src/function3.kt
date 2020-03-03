// 매개변수(인자(인수 argument), 파라미터)가 있는 함수

fun main(args:Array<String>):Unit{
    // aa에 파라미터를 설정하면 자동으로 입력됨
    val xx = aa(30)
    println(xx)
    val yy = getAvg(30,65)
    println(yy)
}
fun aa(x:Int):Double{
     return x * 1.2 + 20
}

fun getAvg(a:Int, b:Int):Double{
    return (a+b)/2.0
}

