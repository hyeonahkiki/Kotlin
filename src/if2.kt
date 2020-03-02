fun main(args: Array<String>): Unit{
//    val a = 100
//    val b = 50
//
//    if(a < b) println("if문")
//    else println("else문")
//    if(a > b)println("a가 큽니다.")
//    else println("b는 a보다 크거나 같다")

    val jumsu = 65
    if (jumsu >= 90) {
        println("A학점")
    } else {
        if (jumsu >=80){
        println("B학점")
    }else {
            if (jumsu >= 70) {
                println("C학점")
            }else{
                println("D학점")
            }
        }
    }

}