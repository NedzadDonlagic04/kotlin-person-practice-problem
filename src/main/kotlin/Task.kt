// Underneath is the description of the practice problem in Bosnian
/*
Napisite glavni program u kojem cete kreirati polje od 5 osoba
i u njega staviti 3 nastavnika i dva studenta. Nakon toga program
treba u petlji ispisati ime i prezime svake osobe te na kraju
petlje prosjecnu placu svih nastavnika koji se pojavljuju u polju.
Takoder, za sljedeci isjecak koda:
    val p1 = Person("Ivo", "Ivic", 20)
    val p2 = Person("Ivo", "Ivic", 20)
    val p3 = Student("Ivo", "Ivic", 20, "0036312123", 3)
    val p4 = Student("Marko", "Markovic", 25, "0036312123", 5)

    println(p1.equals(p2))
    println(p1.equals(p4))
    println(p3.equals(p4))

Ocekuje ovakav ispis:
true
false
true
 */

import kotlin.math.roundToInt

fun twoDecimalRound(value: Double): Double {
    return ((value * 100).roundToInt() / 100.00)
}

fun task() {
    val p1 = Person("Ivo", "Ivic", 20)
    val p2 = Person("Ivo", "Ivic", 20)
    val p3 = Student("Ivo", "Ivic", 20, "0036312123", 3)
    val p4 = Student("Marko", "Markovic", 25, "0036312123", 5)

    val persons = arrayOf(
        Teacher("Robert", "Brown", 60, "robertBrown@gmail.com", "History", 2000.0),
        Teacher("Miki", "Maus", 50, "mikiMaus@gmail.com", "Bosanski", 1500.0),
        Teacher("Pajo", "Patak", 42, "pajoPatak@gmail.com", "Matematika", 1250.0),
        Student("Ivo", "Ivic", 20, "0036312123", 3),
        Student("Marko", "Markovic", 25, "0036312123", 5)
    )
    val teachers = persons.filterIsInstance<Teacher>()

    println(p1.equals(p2))
    println(p1.equals(p4))
    println(p3.equals(p4))
    println()

    println("For loop output:")
    for(person in persons) {
        println(person.toString())
    }
    println("The average salary is ${twoDecimalRound(teachers.sumOf{ it.getSalary() } / teachers.size)}")
}