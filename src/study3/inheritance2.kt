package study3

// 클래스 없이 특정한 클래스를 상속받는 객체 만들기

open class ParentClass(val name:String, val age:Int)
{
    open fun output()
    {
        println("이름: ${name}")
        println("나이: ${age}")
    }
}

// 상속받는 방법1
class ChildClass(name:String, age:Int):ParentClass(name, age)

// 상속받는 방법2
fun main(args:Array<String>):Unit
{
    // 상속을 받는 object
    val childClass:ParentClass = object: ParentClass("이태일", 31)
    {
        override fun output()
        {
            println("ParentClass를 오버라이딩한 함수")
        }
    }
    childClass.output()
}