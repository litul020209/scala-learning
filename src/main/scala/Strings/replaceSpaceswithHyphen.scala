package Strings

object replaceSpaceswithHyphen extends App{
  var wd = "scala programming language"
  var ans = wd.split(" ").mkString("-")
  println(ans)
  var ans2 = wd.replace(" ","-")
  println(ans2)


}
