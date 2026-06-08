package PatternMatching

object pattern08 extends App {
  val num = 50

  num match {
    case value =>
      println(value)
    case 50 => println("Fifty")
  }
}