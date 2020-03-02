// if문이 표현식이 될 수 있다.
// if문이 표현식이 되려면 if, else가 모두 갖춰져 있어야 한다.

fun main(args:Array<String>): Unit{
    val aa: Int = if(10>1){
        println("10은 1보다 크다")
        // Int 타입을 맞추기 위해서
        10
    }else{
        println("거짓입니다.")
        1
    }
    println(aa)
}