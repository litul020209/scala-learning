package Strings

object methodsInString extends App{
  var s = "Litul"
  println(s)
  println(s(0))
  println(s.charAt(0))
  println(s.toUpperCase)
  println(s.toLowerCase)
  println(s.reverse)
  println(s.contains('L'))
  println(s.startsWith("Li"))
  println(s.endsWith("lu"))
  println(s.substring(0,2))
  /*-----------------------*/
  var p = "  Hello World  "
  println(p.trim)
  var new_s = p.split(" ").mkString(" ")
  println(new_s)
  var rep = p.replace(" ","-")
  println(rep)
  var srt = p.sorted
  println(srt)
  println(p.distinct)


}
