import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers

data class User1(var name: String, val gender: String, var email: String)

fun getUsersObservable(): Observable<User1> {
    return Observable.fromIterable(listOf(
        User1("mark",  "male", ""),
        User1("john", "male", ""),
        User1("trump", "male", ""),
        User1("obama", "male", "")
    )).subscribeOn(Schedulers.io())
}

fun main() {
    getUsersObservable()
        .map { user ->
            user.email = String.format("%s@rxjava.wtf", user.name)
            user.name = user.name.toUpperCase()
            user
        }
        .observeOn(Schedulers.io())
        .subscribe(::println)
}