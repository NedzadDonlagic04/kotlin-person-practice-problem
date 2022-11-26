// Underneath is the description of the practice problem in Bosnian
/*
Napravite klase Student i Teacher koje nasljeduju klasu Person, Student
sadrzi atribut studentId (String) i academicYear (short int), a Teacher
sadrzi atribute email (String), subject (String) i salary (double).
Napisite konstruktore za sve parametre, get i set metode, te metode
toString i equals (dva studenta su jednaka ako imaju isti studentId,
neovisno o ostalim podacima, a dva nastavnika su jednaka ako imaju isti
email, neovisno o ostalim podacima). Dodatno, u klasi Teacher napisite
metodu increaseSalary koja ne vraca nista, a prima jedan argument tipa
integer (koji predstavlja postotak). Metoda treba povecati placu nastavnika
za zadani postotak. Takoder, napisite i staticku metodu increaseSalary
koja prima varijabilni broj argumenata, prvi je argument tipa integer
(koji predstavlja postotak), a ostali su objekti tipa Teacher kojima je
potrebno povecati placu za zadani postotak.
 */
class Teacher(name: String, surname: String, age: Int, private var email: String, private var subject: String, private var salary: Double)
    : Person(name, surname, age){
    fun setEmail(email: String): Unit {
        this.email = email
    }

    fun setSubject(subject: String): Unit {
        this.subject = subject
    }

    fun setSalary(salary: Double): Unit {
        this.salary = salary
    }

    fun getEmail(): String = this.email

    fun getSubject(): String = this.subject

    fun getSalary(): Double = this.salary

    fun equals(t: Teacher): Boolean = this.email === t.email

    override fun toString(): String = super.toString() + "\nEmail: ${this.email}\nSubject: ${this.subject}\nSalary: ${this.salary}"

    fun increaseSalary(percent: Int): Unit {
        val part: Double = percent * this.salary / 100
        this.salary += part
    }

    companion object {
        fun increaseSalary(percent: Int, teachers: Array<Teacher>) {
            for(teacher in teachers) {
                teacher.increaseSalary(percent)
            }
        }
    }
}