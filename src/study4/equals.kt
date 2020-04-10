package study4

/* any클래스를 상속받기 때문에 모든 클래스는 equals메소드를가지고있다
 equals() 함수는 Any클래스에 있는 멤버함수이다.
 따라서 모든 클래스는 equals()함수를 가지고 있다.
 오버라이딩도 가능
 equals()는 연산자 ==와 같다.
 */

class Shape(){
    var x:Int = 0
    var y:Int = 0
    var name:String = "Rect"

    fun draw(){
        println("도형 : $name, 위치 : ($x, $y)")
    }
}
fun main(args:Array<String>):Unit
{
    val shape1: Any = Shape()
    val shape2: Any = Shape()
    val shape3 = shape1

    // Shape에는 equals메소드가 없음. any class에 있는 equals를 상속받아서 사용가능
    println("shape1.equals(shape2) is ${shape1.equals(shape2)}")
    println("shape1.equals(shape2) is ${shape1.equals(shape3)}")
}