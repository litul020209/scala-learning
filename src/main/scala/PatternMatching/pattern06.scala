package PatternMatching

object pattern06 extends App{
  val value: Any = "Hello"

  value match {

    case s: String =>
      println("String")

    case n: Int =>
      println("Integer")

    case _ =>
      println("Unknown")
  }

  

}
