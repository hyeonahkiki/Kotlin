package study3

/*
 오버라이딩:고쳐쓰는 것. 함수명은 같은데 내용이 완전 다른. 바꿔서 쓰는것
 슈퍼클래스의 멤버함수를 서브클래스에서 고쳐서(덮어씀) 사용하는 것
 코틀린에서는 오버라이딩을 하는 경우 반드시 override 키워드를 지정
 */

// 오버로딩경우 같은 함수명이여도 매개변수가 다르거나 갯수가다르면 같은함수명을
// 반복할 수 있다.

//부모클래스
open class DemoA
{
    // 클래스와 마찬가지로 멤버함수도 오버라이딩을 허용하도록 하기 위해 open키워드쓰기
    open fun demoAFunc()= println("demoAFunc 함수....")
}

open class DemoB:DemoA()
{
    // 멤버함수도 상속을 받음
    // override를 쓰려면 바꿔쓸 함수에 open을 써야한다.
    // override 키워드는 open키워드를 포함하고 있다.
     override fun demoAFunc(){
        // super는 슈퍼클래스를 의미하는 대명사
        super.demoAFunc()
        // 오버라이딩
        println("DemoBFunc함수 ....")
    }
}
class DemoC:DemoB()
{
    // 재오버라이딩을 허용하지 않도록 할 경우 : final
    override fun demoAFunc(){
        println("hello!!!!")
    }
}

fun main(args:Array<String>):Unit{
    DemoA().demoAFunc()
    DemoB().demoAFunc()
    DemoC().demoAFunc()
}
