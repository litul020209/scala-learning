package PatternMatching

object pattern05 extends App{
  val fruits = List("Apple", "Banana", "Orange")

   fruits match {
    case first :: second :: tail =>
      println(first)
      println(second)
      println(tail)
    case Nil =>
      println("Empty List")
  }

  val lst = List(1,2,3,4)
  val ans = lst match{
    case List(_,_) =>
    case List(1,_,_,_)=>
    case List(_,_*) =>
    case List(1,2,3) :+ 4 =>
  }
}
