package study5

// 주생성자, 보조생성자에도 접근 제한자를 사용할 수 있다.

// name:String 이부분이 주생성자
// 생성자에는 protected 제한자를 지정할 수 없다.
// 접근제한자를 쓸 때 constructor를 쓴다.

// 생성자의 기본 접근제한자는 public이다.
// 주생성자에 접근제한자를 지정하려면 constructor 키워드를 생략하지 않고 그앞에 지정
class ConstructorClass private constructor(name:String)
{
    public constructor(name: String, id:Int): this(name){}
}