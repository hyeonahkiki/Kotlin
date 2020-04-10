package study4

class MyClass1{
    fun fun1(){
        println("fun1() 호출..")
    }
}

class MyClass2{
    fun fun2(){
        println("fun2() 호출..")
    }
}

fun smartCast2(any:Any){
    // any는 fun1()을 가지고 있지 않는데 어떻게 확인?
    // => is연산자로 형변환이 일어난 것이다.

    // 스마트 캐스팅이 이루어짐. any가 Myclass1타입으로 캐스팅팅
   if(any is MyClass1) any.fun1()
    else if(any is MyClass2) any.fun2()
}

fun main(args:Array<String>):Unit
{
    // val myClass1 = MyClass1()과 같은거임
    smartCast2(MyClass1())
    val myClass2 = MyClass2()
    smartCast2((myClass2))
}