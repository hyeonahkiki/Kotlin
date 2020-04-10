package study4

import study3.Product2
import study3.Product3
import study3.Human

fun main(args:Array<String>):Unit
{
    // 또 다르게 쓰려면 val product = study3.Product2()
    val product = Product2("의자", "2020-04-10", 100000)
    println(product.toString())

    val product3 = Product3("책상", 200000)
    println(product3.toString())

    // null은 아무것도 없는 객체를 의미
    // 자바는 모든 참조타입에 null을 지정할 수 있다.
    // 하지만 코틀린은 Nullable 타입이 아니면 null을 저장할 수 없다.
    // ?를 넣어주면 nullable이 된다.(?는 Nullable 타입 연산자)
    // Nullable 타입은 Heap 메모리에 저장된다.
    var human:Human? = Human("이태일", 31)
    human = null

    var aa:Int? = null
    aa = 100
    println(aa)
}