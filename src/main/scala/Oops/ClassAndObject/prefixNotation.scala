package Oops.ClassAndObject

object prefixNotation extends App{
  class Operation(x:Int){
    def unary_+  :Int = x+1
  }

  var c = new Operation(7)

  println(+c)

}
