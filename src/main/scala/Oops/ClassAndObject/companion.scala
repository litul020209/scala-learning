package Oops.ClassAndObject

object companion extends App{
  object Person {
       val n = new Person("Mohit")

  }

  class Person(val name  : String) {
    def name_return : String = this.name
  }

  var c = Person
  println(c.n.name_return)
}
