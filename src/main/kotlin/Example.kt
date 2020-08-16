

fun main1() {
    val greetingFunction = configureGreetingFunction()
    // call this function, the value of numBuilding is printed as 6
    greetingFunction("Guyal")
    // call again, the value of numBuilding is accumulated as 7
    // This mechanism is called Closure - similar with encapsulation of
    // object-orient programming
    greetingFunction("Guyal")
}


fun main() {
    ExampleClass().doSomeAwesomePrinting()
}

class ExampleClass {
    var awesomeVar1: String? = "some awesome string value"
    var awesomeVar2: String? = null

    fun doSomeAwesomePrinting() {
        awesomeVar1?.apply {
            awesomeVar2?.apply {
                println("awesome output 2")
            }
        } ?: print("awesome output 1")

    }
}

// This function return another function, like function factory
fun configureGreetingFunction(): (String) -> String {
    val structureType = "hospitals"
    // numBuilding is declared var usage and is used on outside of anonymous function scope
    var numBuildings = 5
    return { playerName: String ->
        val currentYear = 2018
        numBuildings += 1
        println("Adding $numBuildings $structureType")
        "Welcome to SimVillage $playerName! (copyright$currentYear)"
    }
}

