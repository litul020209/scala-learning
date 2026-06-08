package ConditionalExpression
import scala.io.StdIn._

object practice01 extends  App{
  print("Enter the num: ")
  val num =readInt()
  if (num > 0){
    println(s"the $num is positive")
  }
  else if (num < 0){
    println(s"the $num is negative")
  }
  else{
    println("Zero")
  }

}