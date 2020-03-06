package study2

fun main(args:Array<String>):Unit{
    var res = ""
    var a = 1

    while(a <= 100 ){
        res += "$a"
        a += 1
    }
    println(res)
}