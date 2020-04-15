package study5

// 코틀린에서는 변수가 프로퍼티이다.
// 즉, 변수는 getter/setter를 포함한다.

class AccessTestProperty
{
    private var data: Int = 100

    fun getData():Int {
        return data
    }
}

fun main(args:Array<String>):Unit
{
    val obj = AccessTestProperty()
    // private멤버이기 때문에 직접 접근 안됨
    //println(obj.data)

    // 메소드를 이용해서 접근가능
    println("${obj.getData()}")
}