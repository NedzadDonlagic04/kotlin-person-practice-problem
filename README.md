# kotlin-person-practice-problem

In this project I will be solving 3 practice
problems which tie into one another, all of
them are written in Bosnian and ask as follows:

1. Napravite klasu Person koja opisuje neku osobu. Person sadrzi atribute
   name (String), surname (String), age (int). Napisite konstruktor, get
   i set metode, te metode toString i equals (dvije osobe su jednake ako
   imaju isto ime i prezime te broj godina).


2. Napravite klase Student i Teacher koje nasljeduju klasu Person, Student
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


3. Napisite glavni program u kojem cete kreirati polje od 5 osoba
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