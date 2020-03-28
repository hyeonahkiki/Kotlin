package study2

// 보조 생성자: 여러개의 생성자를 정의하는 방법
/*
    주생성자
    class 클래스이름 constructor(매개변수)
    {
        //보조생성자1 : 클래스 내부에 오는 생성자
        constructor(매개변수) : this(인수)
        {...}

        //보조생성자2
        constructor(매개변수): this(인수)
        {...}
    }
 */

class Demo2(val second:Int)
{
    // 주생성자를 호출한 다음에 보조생성자를 실행
    init{
        println("init블록 실행...")
    }
    // 보조 생성자1
    // this는 class Demo2를 뜻함 , 주생성자를 호출하는 것
    constructor(minute:Int, second:Int):this(minute*60+ second)
    {
        println("보조생성자1 실행 중")
    }
    // 보조 생성자2
    constructor(hour:Int, minute:Int, second:Int):this(hour*60+minute, second)
    {
        println("보조생성자2 실행 중")
    }
    init {
        println("another init 블록 실행 중...")
    }
}
fun main(args:Array<String>):Unit{
    // second프로퍼티 출력
    println("${Demo2(10, 3).second}")
    println("${Demo2(10, 3, 7).second}")
}