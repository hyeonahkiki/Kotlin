package study3

// Any클래스를 이용한 다형성
class  Product3(val name:String="", val price:Int=0)
{
    // Anyclass에 있는 메소드 toString
    override fun toString()=
        "상품명: ${this.name}\n" + "가격: ${this.price}"
}
fun main(args:Array<String>):Unit
{
    val product = Product2("키보드", "2020-04-09", 45000)
    getProductInfo(product)
    val product3 = Product3("핸드폰", 600000 )
    getProductInfo(product3)
}

// any로 설정하면 여러종류를 받을 수 있다.
fun getProductInfo(any:Any)
{
    // toString은 오버라이딩된 메소드
    println(any.toString())
}