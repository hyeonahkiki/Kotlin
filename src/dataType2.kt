fun main(args: Array<String>):Unit{

    //Char 타입 : 문자를 저장할 수 있는 타입(Character의 줄임말)
    // ''을 이용, char타입은 한글자만
    var ch:Char = 'a'

    // char.toInt() : 아스키코드값이 나옴
    println(ch.toInt())

    //'\u' : 유니코드. 다국어 지원(2byte)
    ch = '\uAC00'
    println(ch.toInt())

    ch = '코'
    println(ch.toInt())

}