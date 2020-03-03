//Unit은 반환값이 없는 타입을 의미한다. Unit타입이라고 한다.
// 함수를 작성하다 보면 return값이 필요하지 않을 경우가 있다

fun main(args:Array<String>):Unit{
    aa2(30)
}
// 다른파일에 있어도 함수이름이 같으면 충돌나는 경우가 있다.
// 리턴 타입이 지정되지 않으면 Unit타입이다.
// Unit타입은 생략이 가능하다
//fun aa2(xx:Int){
//    println(xx * 1.0 + 30)
//}
fun aa2(xx:Int) = println(xx*1.0 + 30)