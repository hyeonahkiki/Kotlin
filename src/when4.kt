fun main(args:Array<String>):Unit{
    val data1 = 102

    when (data1){
        //34, 35, 36, 37 ->println("34 <= data1 <= 37")
        // 31부터 40까지
        in 31..40 ->println("31 <= data1 <= 40")
        in 21..30 -> println("21 <= data1 <= 30")
        in 1..10 -> println("1<= data1 ,+ 10에 해당하는 수입니다.")
        !in 1..100 -> println("범위밖의 수입니다.")
        else -> println("data1 >40에 해당하는 수입니다.")
    }
}