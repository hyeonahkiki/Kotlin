package study4


// 객체의 연결구조에도 ?. 연산자를 사용할 수 있다.

class Address{
    val city:String? = "seoul"
}
class Person{
    val address: Address? = Address()
}
fun main(args:Array<String>):Unit
{
    val person:Person? = Person()
    // null인지 확인을 할 필요가 있음
    println(person?.address?.city)
}