package study4

/*
    Nothing 타입 : 함수가 정상적으로 끝나지 않는 것을 명시적으로 표현하는 특수타입
    throw Exception() 표현식은 Nothing 타입이다.
 */
// unit : return하는 타입이 없다
// nothing : 더 이상 실행흐름이 도달할 수 없는 구역. 여기서 그냥 종료
// 함수의 반환타입을 Nothing타입으로 설정하면
// 컴파일러가 정상종료되지 않는 함수임을 미리 알 수 있다.
fun throwing(): Nothing = throw Exception()

fun main(args:Array<String>):Unit
{
    println("프로그램 시작")
    // nothing타입은 return하는 타입이 없어서 그냥 Int타입으로 바꿔서 출력
    // 앞에 있는 타입을 따라가게 된다.
    val a:Int = throwing()
    println("프로그램종료")
}
/*
val x:Int if(aa>=0) aa else throw Exception("aa는 음수")
 */