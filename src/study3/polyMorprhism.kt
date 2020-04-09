package study3

/*
 다형성(polymorphism) : 어떤 하나의 메소드를 다양한 방법으로 동작시키는 것
 하나의 메소드나 클래스가 있을 때 이것들이 다양한 방법으로 동작하는 것
  오버라이딩도 다형성
 */
// 부모클래스
open class SuperClass
{
    open fun greeting() = println("Hello world")
}
// 자녀클래스
class SubClass:SuperClass()
{
    override fun greeting() = println("Hi")
}

fun main(args:Array<String>): Unit
{
    val superClass = SuperClass()
    val subClass = SubClass()
    // 상속받았기 때문에 type SuperClass가 될 수 있는 것
    // 부모클래스가 가진 특성을 가지고 자식클래스가 만들어지는것
    // 자식클래스 타입은 될 수 없다. 자식은 부모클래스가 가지고 있는 않은 것을
    // 가지고 있기 때문
    val superClass1:SuperClass = subClass

    superClass.greeting()
    subClass.greeting()
    superClass1.greeting()
}