package study4

//as 연산자를 이용한 다운 캐스팅
// 다운 캐스팅은 업캐스팅의 반대

open class Super{
    fun superFunc(){
        println("superFunc() 호출")
    }
}

class Sub1:Super(){
    fun subFunc1(){
        println("subFunc() 호출")
    }
}

class Sub2:Super(){
    fun subFunc2(){
        println("subFunc2() 호출")
    }
}

// as 사용형식
// 객체 as 타입 : 객체를 as뒤의 타입으로 바꿔줌
// as는 상속관계에 있는 클래스끼리만 가능
// 단, upcasting했던 객체를 다시 원래 타입으로 변환할 때만 사용할 수 있다.
// 서브타입-->슈퍼타입-->서브타입

fun main(args:Array<String>):Unit{
    // 업캐스팅
    val obj1:Super = Sub1()
    // sub1으로 다운캐스팅했지만 sub1의 부모가 되는 superFunc를 호출 할 수 있다.
    val obj2:Sub1 = obj1 as Sub1

    obj2.superFunc()
    obj2.subFunc1()

    // ClassCastException 에러발생
    // 상위타입을 하위타입으로 다운캐스팅하는 것처럼 보이지만 안됨
    // 다운캐스팅하는 이유 : 원래하위타입에서 상위로 갔다가 다시 하위로 돌아올때 사용
    // 처음에 상위타입이었던 것이 하위타입이 되는 것은 아님
//    val obj3:Sub1 = Super() as Sub1 // 런타임에러
//    obj3.subFunc1()
//
//    // 서로 다른객체로 타입을 바뀌는 것은 안됨
//    val obj4:Sub2 = Sub1() as Sub2 // 런타임에러 : 실제실행하면서 발생하는에러
//    obj4.subFunc2()

    // 업캐스팅
    val obj5:Super? = Sub1()
    val obj6:Sub1 = obj5 as Sub1

    obj6.subFunc1()

    // TypeCastException
//    val obj7:Super? = null
//    val obj8: Sub1 = obj7 as Sub1
//    // null값은 객체가 아니기 때문에 형변환을 할 수 없다.
//    // 런타입 에러 발생
//    obj8. subFunc1()

    // as? nullable 타입인 경우 null값이 들어오면 null을 반환하고,
    // 정상적인 객체가 들어오면 정상적으로 캐스팅을 한다.
    val obj9:Super? = null
    val obj10: Sub1? = obj9 as? Sub1
    println(obj10.toString())
}