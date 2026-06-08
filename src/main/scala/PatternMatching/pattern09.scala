package PatternMatching

object pattern09 extends App{
  val t = (10, "Scala")

  t match {
    case (num, lang) =>
      println(num)
      println(lang)
  }

}
