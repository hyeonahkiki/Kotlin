fun main(args:Array<String>): Unit{
    // String(문자열)은 문자(char)를 나열한 것
    //""를 이용
    var str:String = "Kotlin"
    println(str)

    str = str + "\n코틀린"
    println(str[5])

    val number = 123
    str = str + number
    println(str)

}