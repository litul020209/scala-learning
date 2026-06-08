package Loops
import scala.io.StdIn._

object sumOfDigits extends App{
  print("Enter num: ")
  var num = readInt()
  var sum = 0
  while (num != 0) {
    var c = num % 10
    sum = sum + c
    num = num / 10
    num = num.toInt

  }
  println(sum)

}
