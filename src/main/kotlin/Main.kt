fun main(args: Array<String>) {
    val p1 = Person("Marko", "Markovic", 27)
    val p2 = Person("Pero", "Peric", 30)

    val s1 = Student("Ivica", "Ivic", 20, "0011223344", 2)
    val s2 = Student("Marija", "Marinovic", 22, "5566778899", 4)

    val t1 = Teacher("Pajo", "Patak", 42, "pajoPatak@gmail.com", "Matematika", 1250.0)
    val t2 = Teacher("Miki", "Maus", 50, "mikiMaus@gmail.com", "Bosanski", 1500.0)

    println("Person class test:")
    println(p1.toString())
    println(p2.toString())
    println(p1.equals(p2))
    println(p2.equals(p1))
    println()

    println("Student class test:")
    println(s1.toString())
    println(s2.toString())
    println(s1.equals(s2))
    println(s2.equals(s1))
    println()

    println("Teacher class test:")
    println(t1.toString())
    println(t2.toString())
    println(t1.equals(t2))
    println(t2.equals(t1))
    println()

    println("Salaries before 50% boost: ${t1.getSalary()} and + ${t2.getSalary()}")
    Teacher.increaseSalary(50, arrayOf(t1, t2))
    println("Salaries after 50% boost: ${t1.getSalary()} and + ${t2.getSalary()}")
    println()

    task()
}