// function
fun main(args: Array<String>): Unit{
 //println은 줄바꿈을 해준다. 기본 내장함수. ""로 감싸서 출력해야함
// println("Hello Kotlin")
 println(34 + 23 -100) // 표현식(Expression), 숫자 값 자체를 literal, +/-는 연산자
 //단독 표현식 사용가능

 //변수(Variable) : 값을 저장해 놓는 공간 / 식별자 : 변수이름
 // : 하고 타입을 적어준다

 var sum: Int //변수 선언
  sum = 0 //초기화
 //var sum: Int = 100 선언과 동시에 초기화
 println(sum)

 //var로 선언된 변수는 일반변수(mutable)
 // val은 final 변수, 선언하면 값을 바꿀 수가 없다. 불변 변수(immutable)
 val a: Int = 10 + 100 - 50
 println(a)

 val b: Int = 40 + 70 + a
 println(b)

 sum = a + b
 println(sum)

 var aa = 10 + 10 + 20
 println(aa)
}
