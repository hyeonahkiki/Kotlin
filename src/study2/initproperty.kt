package study2
// 생성자도 함수랑 비슷, 프로퍼티선언과 생성자 정의를 한번에하기
// 주 생성자
class Car(val name:String, val speed:Int=120)
fun main(args:Array<String>):Unit{
    val car = Car("그랜저", speed = 51)
    println(car.speed)
    println(car.name)
}