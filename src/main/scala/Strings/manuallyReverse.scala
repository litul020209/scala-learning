package Strings
import scala.io.StdIn._
object manuallyReverse extends App{
  print("Enter the word: ")
  var s = readLine()
  var rs = ""

  for (c <- s.length - 1 to 0 by -1){
    rs += s(c)
  }
  println(rs)
}
