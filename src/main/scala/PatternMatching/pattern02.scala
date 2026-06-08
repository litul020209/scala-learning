package PatternMatching

object pattern02 extends App{
  case class Sample(num:Int , pNum: String)


  val s1 = Sample(10,"Ten")
  val s2 = Sample(11,"Eleven")

  val ans = s2 match {
//    case Sample(a,b) => s"$a , $b "

    case Sample(c,d) => s"$c , $d"
  }

  println(ans)
}
