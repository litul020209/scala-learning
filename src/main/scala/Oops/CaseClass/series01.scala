package Oops.CaseClass

object series01 extends App{

  val p1 = Person("Ravi", 25)
  val p2 = Person("Ravi", 25)
  val p3 = Person("Kumar", 30)

  println(p1)
  
  println(p1 == p2)
  println(p1 == p3)

  println(p1.name) // Ravi
  println(p1.age) // 25

  val people = Set(p1, p2, p3)
  println(people)

  val map = Map(p1 -> "Engineer", p3 -> "Manager")
  println(map(p1)) // Engineer
}

case class Person(name: String, age: Int)


