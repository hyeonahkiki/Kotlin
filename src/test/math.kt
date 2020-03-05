package test

fun main(args:Array<String>):Unit{
    val x = 100
    val y = -20

    // 다른 패키지에 있는 함수를 사용할 때 앞에 패키지 이름을 써놓아야한다.
    // 사용 => 패키지명.함수명()
    println(study2.min(x, study2.abs(y)))
}