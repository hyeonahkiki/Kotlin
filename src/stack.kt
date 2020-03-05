//메모리 스택(stack)영역

//stack : 지역변수가 저장되는 메모리
// 여기서 stack는 쌓는다는 개념으로 대표적으로 안드로이드의 어플리케이션
// 사용방법을 생각하면 쉽게 이해할 수 있다.

// stack은 지역변수 뿐만 아니라 함수의 매개변수를 저장했다가
// 함수가 종료되면 저장된 내용이 자동으로 사라진다.

//메모리에는 stack영역 이외에 heap영역이 있는데
// heap영역은 전역변수나 객체가 저장되는 영역이다.

fun main(args:Array<String>):Unit{
    val aa = -100
    val res = abs(aa)
    println(res)
}

fun abs(num:Int): Int{
    // 표현식에는 else가 들어가야한다. return과 함께 사용하면 표현식 사용가능
    return if(num>=0) num
    else -num
}
