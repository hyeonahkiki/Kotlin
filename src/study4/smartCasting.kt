package study4

/*
    is연산자 : 타입을 확인하는 연산자
    java의 경우 instanceof 비슷하다고 생각하면됨
 */
fun smartCast(data:Any):Int{
    // is연산자를 거치면서 any 타입은 수식계산 안됨
    // Int으로 형변환을 시켜줌 => 스마트캐스팅이 발생했다.
    if(data is Int) return data * data
    else return 0
}
fun main(args:Array<String>):Unit
{
    println("result: ${smartCast(100)}")
    println("result: ${smartCast(11.1)}")
}