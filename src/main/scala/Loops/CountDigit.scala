package Loops
import scala.io.StdIn._
object CountDigit extends App{
  print("Enter num: ")
  var num = readInt()
  var c = 0
  while (num != 0){
    num = num/10
    num = num.toInt
    c += 1
  }
  println(c)
}
