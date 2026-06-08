package PatternMatching

object pattern01 extends App{
  val m = 1
  val ans = m match{
    case 1 => "One"
    case 2 => "Two"
    case 3 => "Three"
    case _ => "Unknown"
  }

   println(ans)
}
