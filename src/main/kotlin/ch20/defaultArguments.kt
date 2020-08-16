package ch20

fun main(args: Array<String>) {
    TODO()
    log(tag = "main", msg = "This is first log")
    log(msg = "This is second log", tag = "main")
    log(msg = "This is third log")
}

fun log(tag: String = "default", msg: String) =
    println("[$tag] $msg")
