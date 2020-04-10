package study4

// !!. :  Not-null 단정연산자(Not null Assertion Operator)
// !!연산자는 Nullable 타입을 Not-null 타입으로 강제로 캐스팅
class Product{
    var name = ""
    var rdata = ""
    var price = 0

    fun print()
    {
    }
}

fun main(args:Array<String>):Unit
{
    var product:Product? = Product()
    //Not null타입으로 캐스팅 한다 => 형변환
    product!!.name = "책상"
    println(product.name)

    product = null
    product!!.print() // 실행 중에 예외가 발생함(kotlinNullPointerException)발생

}