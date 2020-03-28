package study3

//[] 연산자 : Indexed Access Operator

class Person(var name:String, var birthday:String)
{
    // []연산자 이기에 operator로 오버로딩
    operator fun get(position: Int):String
    {
        return when(position)
        {
            0->name
            1->birthday
            else->"몰라요"
        }
    }

    // operator를 써서 오버로딩
    operator fun set(position:Int, value:String)
    {
        // switch문과 같은느낌
        when(position)
        {
            0->name = value
            1->birthday = value
        }
    }
}
fun main(args:Array<String>):Unit
{
    val person = Person("이태일", "1990-09-24")

    // 실제 처리되는 코드 : person.get(0)
    println(person[0])
    // 실제로 처리되는 코드 : person.get(1)
    println(person[1])

    // 실제로 처리되는 코드 : person.set(0, "표지훈")
    person[0] = "표지훈"
    // 실제로 처리되는 코드 : person.set(1, "1993-02-02")
    person[1] = "1993-02-02"
    println(person.name)
    println(person.birthday)
}
