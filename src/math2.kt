// 다른파일에 있더라고 함수를 불러올 수 있다.
// 파일이 너무 많아지는 경우 파일을 일종의 디렉토리에  나눠 담아서 사용 =>패키지
// 패키지명은 소문자로 쓰는 것이 관례
// 새로운 파일 만들듯이 패키지를 만들 수 있다.
fun main(args:Array<String>):Unit{
    val aa = 100
    val bb = -10
    println(max(aa, abs2(bb)))
}