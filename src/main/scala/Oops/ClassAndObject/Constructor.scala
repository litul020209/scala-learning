package Oops.ClassAndObject

object Constructor extends App{
  val obj = new Sample1("Litu")
  obj.greet("Biswa")
}
class Sample1(val n:String, val a:Int){

  def this(n:String)={

    this(n,0)

  }

  def greet(n:String)={
      println(s"Hii ${this.n} my name is $n")
  }

}