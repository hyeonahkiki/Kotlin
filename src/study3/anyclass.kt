package study3

/*
Any 클래스 : 자바에서 모든 클래스의 부모 클래스(최상위 클래스)=>object
코틀린에서는 모든 클래스의 부모 클래스가 anyclass
특정 클래스도 상속받지 않는다면 anyclass를 상속받는다고 생각하면 됨
특정한 클래스를 상속받는다 해도 자동으로(간접적으로) anyclass를 상속받는 거와 같다.
따라서, 모든 클래스는 anyclass를 상속받는다.
 */

/*
Any 클래스의 세가지 멤버함수
open class Any
{
    open operator fun equals(other:Any?):Boolean
    open fun hashCode():Int
    open fun toString():String
}
 */

class Product2(val name:String="", // 상품명
               val rDate:String="", // 출시일
               val price:Int=0)
{
    // 상속받은 클래스로 사용 가능
    override fun toString()=
        "상품명: ${name}\n" + "출시일: $rDate\n" + "가격: $price 원"
}

fun main(args:Array<String>):Unit
{
    val product2 = Product2("컴퓨터", "2020-04-09", 300000)
    println(product2.toString())
}