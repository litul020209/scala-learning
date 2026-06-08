package Functions
import scala.io.StdIn._
object gcdFind extends App{

  def gcd(num1:Int , num2:Int):Int = {
      val maxNum = if ( num1 > num2) {
        num1
      }else{
        num2
      }
      val minNum  = if (num1 == maxNum) {
        num2
      }else{
        num1
      }
      val gcdValue: Int = if ( maxNum % minNum == 0){
        minNum
      } else{
        var v = 0
         for ( i <- 1 to minNum ){
            if ( maxNum % i == 0 && minNum % i == 0) {
                 v = i
            }
           
        }
        v
      }
      gcdValue

  }

  val num1 = readInt()
  val num2 = readInt()

  println(gcd(num1,num2))


}
