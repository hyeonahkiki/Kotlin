fun main(args:Array<String>):Unit{
    //조건문 if
    var aa = 10
    var bb = 20

    // 명령한줄이면 붙여서 블록없이 표현가능
//    if(aa < bb) println("조건이 참입니다.")

    if(aa < bb) {
        println("조건이 참입니다.")
        bb -= aa
    }else {
        println("조건이 거짓입니다.")
        aa += bb
    }
    println(bb)
    println(aa)

}