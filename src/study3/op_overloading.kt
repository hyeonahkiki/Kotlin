package study3

// 이항연산자 : a + b => a, b가 피연산자. 피연산자가 2개면 이항연산자
// 단항연산자(unary) : a-- => 피연산자가 1개
/*
단항연산자 종류 : +a, -a, !a 오버로딩이 가능한 단항 연산자
    표현식     함수이름     컴파일러에서 동작하는 명령
    +a      unaryPlus           a.unaryPlus()
    -a      unaryMinus          a.unaryMinus()
    !a      not                 a.not()
*/
/*
이항연산자
    a+b         plus            a.plus(b)
    a-b         minus           a.minus(b)
    a*b         times           a.times(b)
    a/b         div             a.div(b)
    a%b         rem             a.rem(b)
    %(Modulus Operator) 나머지(remainder)를 구하는 연산자
    a+=b        plusAssign      a.plusAssign(b)
    a-=b        minusAssign     a.minusAssign(b)
    a*=b        timesAssign     a.timesAssign(b)
    a/=b        divAssign       a.divAssign(b)
    a%=b        remAssign       a.remAssign(b)
    a>b         compareTo       a.compareTo(b)>0
    a<b         compareTo       a.compareTo(b)<0
    a>=b        compareTo       a.compareTo(b)>=0
    a<=b        ''              a.compareTo(b)<=0
    a==b        equals          a?.equals(b)?:(b==null)
    a!=b        equals          a.?.equals(b)?:(b==null)
 */
class Point(var x:Int=0, var y:Int=0)
{
    // 함수에 operator 키워드를 이용해서 오버로딩한다.
    // plus(받을것의 타입)
    operator fun plus(obj:Point):Point
    {
        return Point(x + obj.x, y + obj.y)
    }
    operator fun minus(obj:Point):Point
    {
        return Point(x-obj.x, y-obj.y)
    }
    operator fun times(num: Int):Point
    {
        return Point(x * num, y*num)
    }
    operator fun div(num:Int):Point
    {
        return Point(x/num, y/num)
    }

    fun output()
    {
        println("x:${x}, y:${y}")
    }

}
fun main(args:Array<String>):Unit
{
    val point1 = Point(10, 20)
    val point2 = Point(20, -5)

    // 객체끼리 더하려고 하면 컴파일 오류가 남
    // 하지만 opreator fun을 설정하면 컴파일 오류가 사라짐
    val point3 = point1 + point2
    val point4 = point3 * 10
    val point5 = point4 / 5

    point3.output()
    point4.output()
    point5.output()
}
