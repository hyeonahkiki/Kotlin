/*
when(타깃표현식){
    타킷표현식과 비교되는 값 ->
    {
        코드
    }
}
*/

fun main(args:Array<String>):Unit
{
    val jumsu = 50

    when (jumsu/10)
    {
        // 6
        6 -> { println ("D")}
        7 -> { println("C")}
        8 -> { println("B")}
        9, 10 ->{ println("A")}
        else -> { println("F")}
    }
    println("End")
}
