package study4

// Null 확인 연산자 ?.을 이용

var data1:String = "이태일"

// string도 가질 수 있고 null도 가질 수 있다.
var data2:String? = null

fun myFunc(args:String)
{

}
fun main(args:Array<String>):Unit
{
    data2 = "표지훈"
    val data3:String?= data2
    // 같은 문자열이도 nullable타입이면 넣을 수 없다.
//    val data4:String = data2

//    myFunc(data2)
}