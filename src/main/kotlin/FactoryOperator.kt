import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers
import java.util.concurrent.TimeUnit

class FactoryOperator {
    fun testCall() {
        Observable.fromCallable {
            1
        }.subscribe(::print,::print)
    }
}

class Parent {
    fun parentFunctionality() {

    }
}

open class Child {
    private val parent = Parent()
    fun parentFunctionality() { parent.parentFunctionality() }
    fun childFunctionality() {

    }
}

class Grandchild {
    private val parent = Parent()
    private val child = Child()
    fun parentFunctionality() { parent.parentFunctionality() }
    fun childFunctionality() { child.childFunctionality() }
    fun grandchildFunctionality() {

    }
}

fun main() {
    Observable.fromIterable(listOf("A","B","C","D","E","F"))
        .buffer(2)
        .subscribe(::println)

}