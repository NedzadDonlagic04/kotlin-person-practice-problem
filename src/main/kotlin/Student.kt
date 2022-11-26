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
(koji predstavlja postotak), a ostali su objekt tipa Teacher kojima je
potrebno povecati placu za zadani postotak.
 */
class Student(name: String, surname: String, age: Int, private var studentId: String, private var academicYear: Short)
    : Person(name, surname, age){
    fun setStudentId(studentId: String): Unit {
        this.studentId = studentId
    }

    fun setAcademicYear(academicYear: Short): Unit {
        this.academicYear = academicYear
    }

    fun getStudentId(): String = this.studentId

    fun getAcademicYear(): Short = this.academicYear

    fun equals(s: Student): Boolean = this.studentId === s.studentId

    override fun toString(): String = super.toString() + "\nStudent ID: ${this.studentId}\nAcademic Year: ${this.academicYear}"
}