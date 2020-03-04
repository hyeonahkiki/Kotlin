/*
 오버로딩(overloading)
 : 같은 이름의 함수를 계속사용할 수 있음. 매개변수의 개수, 타입이 다른 경우
 같은 이름의 함수 여도 사용할 수 있다.
 같은 이름의 함수를 매개변수를 다르게해서 여러개 정의 하는 것

매개변수를 다른게 한다는 것은 타입이나 갯수를 다르게 한다는 의미.
 */

//함수 시그니처(Function Signiture)란? 매개변수개수, 타입, 반환타입 등을 통들어지칭
// fun 함수명(매개변수1, 매개변수2): 리턴타입 => 전체를 함수 시그니처

fun some(a:String){
    println("some(a: String) 호출")
}

fun some(a:Int){
    println("some(a:Int) 호출")
}

fun some(a:Int, b:String){
    println("some(a:Int, b:String) 호출")
}

fun main(args:Array<String>):Unit{
    some("hello")
    some(5)
    some(100,"hi")
}