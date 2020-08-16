package ch20

data class Price(val value: Double, val currency: String = "$")

data class Book(
    val ISDN: String,
    val name: String,
    val pages: Int,
    val price: Price,
    val weight: Double,
    val year: Int,
    val author: String
)

typealias BookMapper<T> = (Book) -> T

typealias Fun<A,B> = (A) -> B
infix fun <A, B, C> Fun<B,C>.after(f:Fun<A,B>): Fun<A,C> = { x: A -> this(f(x)) }

fun main() {
    val androidBook = Book(
        "8850333404",
        "Android 6: guida per lo sviluppatore (Italian Edition)",
        846,
        Price(39.6, "#"),
        2.1,
        2016,
        "Massimo Carli"
    )
//
//    val obj: Any = androidBook
//    println("obj description:$obj")

//    val bookWeightFun = fun(book: Book) = book.weight
//    val bookPriceFun = fun(book: Book) = book.price.value
//    // 1
//    var mapper: BookMapper<Double> = bookWeightFun
//    // 2
//    var currency: BookMapper<String> = { it.price.currency }
//    // 3
//    println("Weight of ${androidBook.name} is ${mapper(androidBook)} KG")
//    // 4
//    mapper = bookPriceFun
//    // 5
//    println("Price of ${androidBook.name} is ${mapper(androidBook)} ${currency(androidBook)}")

//    val getPrice: Fun<Book,Price> = { book ->  book.price }
//    val formatPrice: Fun<Price, String> = fun(priceData: Price) = "value: ${priceData.value} ${priceData.currency}"
//    val compositeResult: String = (formatPrice after getPrice)(androidBook)
//    println(compositeResult)

    val logger = Logger()
    //val getPriceWithLog: Fun
}
