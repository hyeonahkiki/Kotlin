package study3

import java.lang.IllegalArgumentException

// 상속(Inheritance) : 코드를 재사용해서 확장을 하는것.
/*
확장 : 상속을 통해서 이루어진다. class A의 기능을 그대로 물려받는 것(A1)을
상속이라 한다.상속이 되는 A를 부모클래스(슈퍼클래스), A1은 자식클래스(서브클래스)
A1이 가지고 있는 기존의 기능에 새로운 기능을 더한 것을 상속이라고 한다.
 */
/*
클래스가 폐쇄적임. 기본적으로 class의 상속이 막혀있다.(상속에 폐쇄적)
클래스선언이 final로 되어있음(한번 설정하면 수정이 안됨)
 */

// 따라서, 클래스 앞에 open키워드를 이용해서 상속하도록 해주어야 한다.
/*확장클래스(상속받는 클래스) 형식
class 클래스이름:슈퍼클래스생성자(인수)

슈퍼클래스 형식
open class 클래스이름
 */

open class Human(val name:String, val age:Int)
// Human(name, age)이 부분이 상속받는 부분
// 자식클래스도 앞에 open을 붙여주면 부모클래스가 될 수 있다.
// 상속은 하나의 클래스만 가능
class Employee(name: String, age: Int, val id:Int):Human(name, age)

fun main(args:Array<String>):Unit{
    val human = Human("이태일", 30)
    val  employee = Employee("표지훈", 28, 2020040601)
    val human1:Human = Employee("안재효", 31, 2020040602)
    println(human1.name)
    // id 프로퍼티는 자식클래스만 가지고 있는 것이기 때문에 부모클래스는 없다.
    // 자식클래스가 가지고 있는 프로퍼티에는 접근 불가능.
//    println(human1.id)
}

// casting : 형변환(특정한 타입을 다른 타입으로 변환하는 것)
// Upcasting : 서브클래스의 인스턴스를 슈퍼클래스 타입으로 만드는 것