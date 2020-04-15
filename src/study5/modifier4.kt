package study5

// 클래스 멤버의 접근 범위

open class Super{
    val publicData: Int = 100
    // 최상위 프로퍼티에서는 사용이 안되고 상속과 관련
    protected val protectedData: Int = 200
    private val privateData: Int = 300
}
class Sub:Super(){
    fun accessTest(){
        println("$publicData")
        // protectd는 자신의 클래스내에서 그리고 자식 클래스에서 접근이 가능
        println("$protectedData")
        // private 자체가 같은 파일이면 접근이 되어야하는데
        // 안되는 이유? => class가 다르기 때문
        // 클래스 내부의 멤버에 지정하면 파일 같더라도 다르면 접근 불가
        //println("$privateData")
    }
}

class Other{
    fun accessTest(){
        val myClass = Super()
        println(myClass.publicData)
        // protectd는 자신의 클래스내에서는 가능. 상속받은 자식클래스는 가능
        // 외부클래스 접근하려고 하면 에러
        //println(myClass.protectedData)
        //println("${myClass.privateData}")
    }
}

// 접근 범위크기가 넓은 순서
/*
1. public(코틀린에서 기본 접근 제한자)
2. protected / internal
3. private
 */