package study2

// 생성자(constructor)
/*
생성자는 객체를 초기화하는 멤버함수라고 생각하면 된다.
그러면 매번 프로퍼티 값을 넣지 않아도 된다.

//생성자를 만드는 형식
class 클래스명 constructor(생성자의 매개변수 선언){...}
위에서 constructor는 생략이 가능하다.

 */
class Human constructor(name: String, age:Int)
{
    val name:String
    val age:Int

    // 생성자의 매개변수 값을 초기화를 해준다.
    // init 블록은 여러개로 나눠서 사용이 가능하다.
    init
    {
        // 프로퍼티의 값에 매개변수 값을 넣겠다.
        this.name = name
        this.age = age
    }
}
fun main(args:Array<String>):Unit
{
    val human = Human("홍길동", 28)
    // 매번 이렇게 넣기가 불편
//    human.name = "홍길동"
    println(human.name)
    println(human.age)
}