// Underneath is the description of the practice problem in Bosnian
/*
Napravite klasu Person koja opisuje neku osobu. Person sadrzi atribute
name (String), surname (String), age (int). Napisite konstruktor, get
i set metode, te metode toString i equals (dvije osobe su jednake ako
imaju isto ime i prezime te broj godina).
 */
open class Person(private var name: String, private var surname: String, private var age: Int) {
    fun setName(name: String): Unit {
        this.name = name
    }

    fun setSurname(surname: String): Unit {
        this.surname = surname
    }

    fun setAge(age: Int): Unit {
        this.age = age
    }

    fun getName(): String = this.name

    fun getSurname(): String = this.surname

    fun getAge(): Int = this.age

    fun equals(p: Person): Boolean = (this.name === p.name && this.surname === p.surname && this.age == p.age)

    override fun toString() = "Name: ${this.name}\nSurname: ${this.surname}\nAge: ${this.age}"
}