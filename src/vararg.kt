/*
가변인수 : vararg 키워드를 이용하여 가변적으로 매개변수를 사용할 수 있다.
 */

fun main(args:Array<String>): Unit{
    val sum1 = getTotal(1, 2, 3)
    println(sum1)
    val sum2 = getTotal(10, 11, 22, 33)
    println(sum2)
    val sum3 = getTotal(11, 22, 33, 44, 55, 66, 77, 88, 98)
    println(sum3)
    val sum4 = getTotal()
    println(sum4)
}

// vararg : 가변인수의 개수를 마음대로 지정
fun getTotal(vararg number:Int): Int{

    // size : number의 개수를 알기위해서, 타입은 Int
    val cnt = number.size
    // 한줄에 여려 명령을 쓸 때는 ;을 써야함
    var i = 0; var sum = 0

    while(i < cnt){
        //vararg로 number을 선언했기 때문에 배열로 봐야한다다
        sum += number[i]
        i += 1
    }
    return sum
}

// 가변인수와 일반변수를 같이 사용할 수 있다.
// 주의점 : 가변인수는 일반변수보다 오른쪽에 배치 되어야한다.
/*
   fun myFunc(something: Char, vararg numbers: Int):Int{}

   fun myFunc(vararg numbers: Int, something: Char): Int // 오류발생
    fun myFunc(vararg numbers: Int, something = Char타입의 인수): Int //가능

 */