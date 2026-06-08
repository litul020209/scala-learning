package Strings
import scala.io.StdIn._
object vowelsConsonants extends App{
  print("Enter the word with out space inside: ")
  val s = readLine()
  var v = 0
  var c = 0
  for (ch <- s){
    if (ch == 'a'){
      v += 1
    }
    else if( ch == 'e'){
      v += 1
    }
    else if (ch == 'i') {
      v += 1
    }
    else if (ch == 'o') {
      v += 1
    }
    else if (ch == 'u') {
      v += 1
    }
    else {
      c += 1
    }
  }
  println(s"total number of vowel is $v")
  println(s"total number of consonant is $c")

}
