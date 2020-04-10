package study4

fun main(args:Array<String>):Unit
{
    var aa:String?= "표지훈"
    var len: Int = if(aa !=null){
        aa.length
    }else{
        -1
    }
    println(len)
    aa = null
    // ?. null값인지를 확인하고 null값이면 ?: -1 출력
    len = aa?.length ?: -1
    println(len)

    aa?: println("aa는 null입니다.")
}