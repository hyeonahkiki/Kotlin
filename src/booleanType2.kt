// 논리연산자(logical Opreator)
/*
&&(and연산자) : a && b(a와 b가 모두 true, 값 true, 둘중하나라도 false이면 false)
||(or연산자) : a or b(a와 b 중 하나라도 true이면 결과 true, 둘다 false이면 false)
!(not연산자) : a가 true이면  결과는 false, a가 false이면 결과 true
*/

fun main(args:Array<String>): Unit {
    val aa= 20
    val bb= 30

    var bool:Boolean = (aa-bb < aa + bb) && (aa!=20)
    println(bool)

    bool = !((aa+bb) > (aa*3) || (bb-aa)>0)
    println(bool)
}