package study2

class Student{
    var name = ""
    var birthday = ""
    var gender = ""
}

fun printStudentInfo(student: Student){
    println("이름 : " + student.name)
    println("생일 : " + student.birthday)
    println("성별 : " + student.gender)
}

fun main(args:Array<String>):Unit{
    val student = Student()
    student.name = "죠르디"
    student.birthday = "190505"
    student.gender = "남"
    printStudentInfo(student)
}