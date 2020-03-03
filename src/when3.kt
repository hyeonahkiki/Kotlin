fun main(args:Array<String>):Unit{
    val data1 = "hello world"

    when (data1){
        "hello" -> println("data1은 hello입니다.")
        "Kotlin" -> println("data1은 Kotlin입니다.")
        else -> println("data1은 hello도 Kotlin도 아닙니다.")
    }
}