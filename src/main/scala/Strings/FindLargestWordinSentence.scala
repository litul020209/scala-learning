package Strings

object FindLargestWordinSentence extends App{
  var s = "Scala is a powerful language"

  val lst = s.split(" ")
  var m = 0
  var c = ""

  for ( w <- lst){
       if (w.length > m) {
         m = w.length
         c = w
       }
  }
  println(s"$m,$c")

}
