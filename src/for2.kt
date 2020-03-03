/*
for (i in 리스트 until){}
 */
fun main(args:Array<String>):Unit{
    // 1-99까지만 출력
    // until은 자신을 포함하지 않음
    for (i in 1 until 100 ){
//        println(i)
    }
    // step 단위 : 단위만큼 건너 뛰어서 출력
    for (j in 2..100 step 2)
//        println(j)
    // 숫자를 감소시키면서 출력할 때는 downTo
    for (k in 10 downTo 1)
        println(k)
}