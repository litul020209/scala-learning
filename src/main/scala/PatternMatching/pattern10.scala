package PatternMatching

object pattern10 extends App{
  val lst = List(1,2,3,4)

  val ans = lst match {
    case lstOfString: List[String] => "String"
    case lstOfInt: List[Int] => "Int"

  }
  println(ans)
}
