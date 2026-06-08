package PatternMatching

object pattern07 extends App {
  val num = 15

  num match {

    case x if x > 10 =>
      println("Greater than 10")

    case _ =>
      println("Small")
  }
}
