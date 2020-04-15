package study5

class AccessTestProperty2{
    // 아래의 data 프로퍼티는 접근제한자가 없다. 따라서 public 지정
    // get() 함수도 public이 적용된다.
    // set() 함수는 private이 지정되어 있음.
    // 결론적으로 data 프로퍼티에는 값을 불러올 수 있어도 변경은 할 수 없다는 의미.
    var data:Int = 100
        private set(value){
            field = value
        }
}

fun main(args:Array<String>):Unit
{
    val obj = AccessTestProperty2()
    println(obj.data)
    // setter가 private이기 때문에 외부에서 값을 변경할 수가 없다.
    //obj.data = 200
}

/*
get()함수(getter)는 기본적으로 프로퍼티의 접근제한자와 항상 같다.
set()함수(setter)는 프로퍼티의 접근제한자와 다르게 설정할 수 있다.
단, 접근 범위를 넓혀서 설정할 수는 없다.
예시) private val data:Int = 100 이 경우, setter는 public은 허용안됨
     val data:Int = 100일 경우 setter는 private 선언이 가능하다.
     protected val data: Int = 100 setter는 private, protected이 가능
 */