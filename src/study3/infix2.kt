package study3

class FunClass {
    infix fun infixFunc(a: Int): Int {
        println("infixFunc 호출....${a}")
        return a * a
    }

    infix fun addStr(str: String): String {
        return "이태일 ${str}"
    }

}

fun main(args: Array<String>): Unit {
    val obj = FunClass()
    var aa = obj.infixFunc(100)

    // infix선언을 해줘서 이렇게도 사용 가능
    var bb = obj infixFunc 20
    println(aa)
    println(bb)

    var str2 = obj.addStr("hi")
    var str3 = obj addStr "군인"
    println(str2)
    println(str3)
}