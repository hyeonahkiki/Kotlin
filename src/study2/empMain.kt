package study2

fun main(args:Array<String>): Unit{
    val emp = Employee()
    emp.name = "홍길동"
    emp.birthday = "911011"
    emp.gender = "남"

    // emp에 있는 prinInfo함수를 실행
    emp.printInfo()
}