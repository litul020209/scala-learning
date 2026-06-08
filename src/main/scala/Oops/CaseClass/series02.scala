package Oops.CaseClass

object series02 extends App{
  val ravi = Person1("Ravi", 25, "Hyderabad")
  println(ravi)
  val olderRavi = ravi.copy(age = 26)
  println(olderRavi) // Person(Ravi,26,Hyderabad)
  println(ravi)
  val movedRavi = ravi.copy(city = "Mumbai")
  println(movedRavi)
}
case class Person1 (name: String, age: Int, city: String)