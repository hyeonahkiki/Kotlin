package study2

fun main(args:Array<String>):Unit{
    val product:Product
    product = createProduct()
    printInfo(product)
    raisePrice((product))
    printInfo(product)
}

fun createProduct() : Product{
    val banana = Product()
    banana.name = "바나나"
    banana.price = 5000

    return banana
}
fun raisePrice(product:Product){
    product.price += 500
}

fun printInfo(product: Product){
    println("이름: ${product.name}, 가격 : ${product.price}")
}