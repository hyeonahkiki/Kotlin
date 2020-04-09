package study3

// Getter/Setter 오버라이딩을 할 수 있다.

open class Parent
{
    open var aa = 10
        get()
        {
            println("parent aa Getter호출...")
            return field
        }
        set(value)
        {
            println("parent aa Setter호출...")
            field = value
        }
}

class Child:Parent()
{
    override var aa:Int
        get()
        {
            println("child aa의 Getter호출")
            return super.aa
        }
        set(value)
        {
            println("child aa의 Setter호출")
            super.aa = value
        }
}
fun main(args:Array<String>):Unit
{
    val child = Child()
    // setter가 호출
    child.aa = 100
    child.aa
}
