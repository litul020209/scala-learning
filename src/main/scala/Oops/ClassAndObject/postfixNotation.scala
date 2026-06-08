package Oops.ClassAndObject

object postfixNotation extends App{
  class Operation(x: Int) {
    def isZero: Boolean= x == 0
  }
  val c = new Operation(7)

  println( c.isZero)

}
