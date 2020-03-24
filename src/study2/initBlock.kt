package study2

// constructor는 생략이 가능하다.
class Rectangle(width:Int, height:Int)
{
    // width는 초기화
    val width = width
    // init블록을 이용해서 초기화
    val height : Int

    // init블록은 여러개로 나눠서 실행가능
    init{
        this.height = height
    }
    val size: Int

    init{
        size = width * height
    }
}
fun main(args:Array<String>):Unit{
    val rectangle = Rectangle(5,6)
    println(rectangle.size)
}