package ch20

class Logger {
    var log = StringBuilder()
    fun log(str: String) {
        log = log.append(str).append("\n")
    }
}