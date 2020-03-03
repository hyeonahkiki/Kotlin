//when 표현식
// when 표현식도 if표현식과 마찬가지로 else블록을 포함해야한다.

fun main(args:Array<String>):Unit{
    val jumsu = 98

    val hakjum:Char = when(jumsu/10)
    {
        6 -> 'D'
        7 -> 'C'
        8 -> 'B'
        9, 10 -> 'A'
        else -> 'F'
    }
    println(hakjum + "학점")
}