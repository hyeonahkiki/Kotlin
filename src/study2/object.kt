package study2

import java.util.*

// 객체(object)

fun main(args:Array<String>):Unit{
    //object는 타입이 없다.
    val person = object{
        // object 객체에 포함된 변수들을 프로퍼티(property)
        // 프로퍼티는 속성이라고 생각해도됨
        val name:String = "김말똥"
        val age:Int = 33
    }

    println(person.name)
    println(person.age)
}

