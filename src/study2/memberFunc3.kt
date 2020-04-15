package study2

class Demo{
    // 여기 num가 매개변수num이 겹친다.
    var num = 100

    fun demoFunc(num:Int)
    {
        println(num)
        // this : 매개변수 num과 Demo의 프로퍼티 num이 구분이 간다.
        println(this.num)
    }
}
fun main(args:Array<String>):Unit{
    val demo = Demo()
    demo.demoFunc(200)
}