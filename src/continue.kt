/*
continue문
    반복문에 일부 코드를 무시하고 건너뛸때 사용
 */
fun main(args:Array<String>):Unit{
    var aa = 0
    while(aa<10){
        aa += 1
        // 홀수이면 println을 실행하지 않는다.
        if (aa%2 !=0)
            continue
        println(aa)
    }
}