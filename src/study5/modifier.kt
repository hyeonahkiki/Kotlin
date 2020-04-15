package study5

// 접근제한자(Access modifier, visibility modifier)
/*
외부에서 클래스, 생성자, 프로퍼티, 함수 등을 이용할 때 접근의 범위를 지정하고자할때사용
 */
/*
    public      모든 곳에서 접근이 가능. 접근 제한자 생략되면 기본적으로 public
                지금 까지 계속 public 접근 제한자를 사용해 온 것이나 다름없다.
    internal    같은 모듈 안에서 접근 가능, 여기서는 프로젝트의 모듈을 의미한다.
    protected   클래스 내부와 서브클래스 안에서만 접근 가능
    private     가장 접근 범위가 좁은 경우. 프로퍼티와 멤버함수일 경우,
                해당 클래스 안에서만 접근 가능하고 그 외의 경우, 같은 파일 내에서만
                접근 가능

    접근 제한자는 클래스, 인터페이스, 생성자, 함수, 프로퍼티에 지정할 수 있다.
    유지 보수가 편하다. 
    (public) class User{
    public constructor(){}
    public val name:String = "홍길동"
    public fun myFunc(){}

    }
 */

class Rectangle(private val width:Int, private val height:Int)
{
    val size: Int
        get() = width * height
}

fun main(args:Array<String>):Unit
{
    val rectangle = Rectangle(10, 5)
    //rectangle.width :  접근 불가
    // 접근제한자가 없으면 기본 public으로 접근 가능
    println(rectangle.size)
}