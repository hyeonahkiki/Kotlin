package study2

class Employee{
    // 프로퍼티
    var name = ""
    var birthday = ""
    var gender = ""

    // 멤버 함수 : 클래스에 내장된 함수를 의미
    fun printInfo(){
        println("이름 : " + this.name)
        println("생일 : " + birthday)
        println("성별 : " + this.gender)
    }
    // 위의 프로퍼티와 멤버 함수를 Employee의 멤버라고 한다.
}

