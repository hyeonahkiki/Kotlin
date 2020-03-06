package study2

// 클래스(class) : 객체를 찍어내는 틀(설계도)
// 여러객체를 만들어 쓸때는 class를 쓴다.

//val person1 = object{
//    val name: String = "김말똥"
//    val age: Int = 33
//}
//
//val person2= object{
//    val name: String = "고길동"
//    val age: Int = 23
//}

//=> 번거로움

class Person{
    var name:String = ""
    var age:Int = 0
}

fun main(args:Array<String>): Unit{
    // class를 타입으로 줌
    val person:Person
    //인스턴스 : 객체화 과정
    person = Person()
    person.name = "고길동"
    person.age = 23

    val person2 = Person()
    person2.name = "김말똥"
    person2.age = 29

    val person3 = Person()
    person3.name = "강말똥"
    person3.age = 20

    println(person3.name)
}