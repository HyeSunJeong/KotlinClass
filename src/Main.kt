import kotlin.concurrent.thread

fun doWork(person: Person) {
    person.whatIsYourJob()
    when (person) {
        is Doctor ->
            person.fixIt()
        is Professor ->
            person.teachIt()
    }
}

fun main() {
    var doctor: Person = Doctor()
    var professor: Person = Professor()
    doWork(doctor)
    doWork(professor)
}