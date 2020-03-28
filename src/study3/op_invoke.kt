package study3

//()호출 연산자(Invoke Operator) : 함수 호출할 때 사용하는 연산자
// 호출 연산자도 오버로딩이 가능하다.

class Product(val code:Int, val name:String)
{
    operator fun invoke(value:Int)
    {
        println(value)
        println("code: $code\nname: $name")
    }
}
fun main(args:Array<String>):Unit
{
    val prod = Product(202003, "노트북")
    // 실제 처리되는 코드 prod.invoke(200)
    prod(200)
}