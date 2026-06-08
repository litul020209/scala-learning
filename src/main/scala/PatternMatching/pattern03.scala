package PatternMatching

object pattern03 extends App{
  case class Sample1(num: Int, pNum: String)


  val s1 = Sample1(10, "Ten")
  val s2 = Sample1(9, "Eleven")

  val ans = s2 match {
//    case Sample1(a,b) => s"$a , $b "

    case Sample1(c, d) if c > 10 => s"$c , $d"
  }

  println(ans)
}
