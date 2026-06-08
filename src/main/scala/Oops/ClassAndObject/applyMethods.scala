package Oops.ClassAndObject

object applyMethods extends App{
  class Operation {
    def apply() = true
  }
  var c = new Operation
  println(c())
}
