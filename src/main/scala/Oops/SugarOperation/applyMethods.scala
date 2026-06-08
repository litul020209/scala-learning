package Oops.SugarOperation

object applyMethods extends App{
  class Person  {
    def apply(num: Int): String = num.toString
  }
  val c = new Person
  val nc = c.apply(5)

  println(nc)

  println(nc.getClass)


}
