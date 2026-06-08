package Basics
import scala.io.StdIn._
object sumOfDigits extends App{
   print("Enter the num: ")
   val num:Int = readInt()
   var sum = 0
   var temp = num

   while (temp != 0) {
     val  n = temp % 10
     sum = sum + n
     temp = temp/10
   }

   println(s"the total sum of all digit is : $sum")

//  using the loop also
   val strNum = num.toString
   var s = 0
   for ( c <- strNum ){

       val n:Int = c.asDigit
    
       s = s + n

   }

   println(s)
}
