package ch8

import java.lang.StringBuilder
import kotlin.math.roundToInt

const val TAVERN_NAME = "Taernyl's Folly"

var playerGold = 10
var playerSilver = 10

fun main(args: Array<String>) {
    placeOrder("shandy,Dragon's Breath,5.91")
    //`approve String is immutable`("Dragon's Breath")
    //`demonstrate String Comparison`()
    //`demonstrate wink emoji unicode`()
}

fun performPurchase(price: Double) {
    displayBalance()
    val totalPurse = playerGold + (playerSilver / 100)
    println("Total purse: $totalPurse")
    println("Purchasing item for $price")
    val remainingBalance = totalPurse - price
    println("Remaining balance: ${"%.2f".format(remainingBalance)}")

    val remainingGold = remainingBalance.toInt()
    val remainingSilver = (remainingBalance % 1 * 100).roundToInt()
    playerGold = remainingGold
    playerSilver = remainingSilver
    displayBalance()
}

private fun displayBalance() {
    println("Player's purse balance: Gold: $playerGold, Silver: $playerSilver")
}
fun placeOrder(menuData: String) {
    val indexOfApostrophe = TAVERN_NAME.indexOf('\'') // indexOf method
    val travernMaster = TAVERN_NAME.substring(0 until indexOfApostrophe) // substring method
    // destructuring
    val (type, name, price) = menuData.split(',') // split method
    println("Madrigal speaks with $travernMaster about their order.")
    println("Madrigal buys a $name ($type) for $price")

    performPurchase(price.toDouble())
    val phrase = if (name == "Dragon's Breath") {
        "Madrigal exclaims ${toDragonSpeak("Ah, delicious $name")}"
    } else {
        "Madrigal says: Thanks for $name"
    }
    println(phrase)

}

private fun toDragonSpeak(phrase: String) =
    phrase.replace(Regex("[aeiou]")) { // replace method
    when (it.value) {
        "a" -> "4"
        "e" -> "3"
        "i" -> "1"
        "o" -> "|_|"
        else -> it.value
    }
}

private fun `approve String is immutable`(name: String) {
    val phrase = "Ah, delicious $name"
    println(phrase)
    println(toDragonSpeak(phrase))
    println(phrase) // after call toDragonSpeak, phrase value doesn't change still
}

private fun `demonstrate String Comparison`() {
    val str1 = StringBuilder("John").toString()
    val str2 = StringBuilder("John").toString()
    println("structural equality(==):${str1 == str2}")
    println("referential equality(===):${str1 === str2}")
    println("${str1.hashCode()} v.s ${str2.hashCode()}")
    // In Java, structural equality of String is equal method
    // In Java, referential equality of String is == symbol
}

private fun `demonstrate wink emoji unicode`() {
    val omSymbol = '\u0950' // \u is unicode character escape
    println("$omSymbol") // print ॐ
}
