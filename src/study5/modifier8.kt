package study5

// 상속관계와 접근제한자(open, private)
// open과 private은 함께 사용할 수 없다.

open class Super2{
//    private fun myFunc(){
//    }
    open fun myFunc2(){}

    open protected fun myFunc3(){}
}
class Sub2:Super2(){
    // 상위의 접근제한 범위를 줄여서 하위에서 오버라이드를 할 수는 없다
    // override private fun myFunc2(){}

    // 오버라이딩할때 상위보다 늘려서 받을 수 있다.
    override fun myFunc3(){}
}