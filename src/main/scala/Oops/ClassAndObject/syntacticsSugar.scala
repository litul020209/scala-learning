package Oops.ClassAndObject

object syntacticsSugar extends App{
  val litu = new Person("Litu" , "jersy")
  println(litu likes "jersy")

}

class Person(name : String , movie:String) {
   def likes(movie:String):Boolean = movie == this.movie

}