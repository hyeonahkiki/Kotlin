/*
for문

for(변수 in 리스트){
    실행코드
}
 */
fun main(args:Array<String>):Unit{
    var sum = 0
    for (num in 1..10){
        sum+= num
    }
    println(sum)
}