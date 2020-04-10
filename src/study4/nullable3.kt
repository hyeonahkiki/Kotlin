package study4

fun main(args:Array<String>):Unit
{
    var aa: String? = "hello"

    // ?. 널 확인 연산자
    // null이라면 length를 호출하지 않고 null을 리턴
    val length: Int? = aa?.length

    // null값이 아닌경우에만 length를 사용하도록하자
    val length1:Int? = if(aa !=null){
        aa.length
    }else{
        null
    }
}

