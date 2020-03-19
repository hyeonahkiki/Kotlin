/*
do while문
do {
    실행시킬코드
}while(Boolean 표현식)
*/
fun main(args:Array<String>):Unit{
    var a = 1
    // 최소한 한번은 수행
    do{
        println("먼저실행되는 코드")
    //실행된 다음 실행 조건이 참이면 위로 올라가서 실행
    // 거짓이면 빠져나오게 된다.
    }while(a ==1)
}