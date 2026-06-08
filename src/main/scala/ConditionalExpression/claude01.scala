package ConditionalExpression
import scala.io.StdIn._
object claude01 extends App{
  
  val stdName:String = readLine()
  val age:Int = readInt()
  val percentage:Double = readDouble()
  val isPassed :Boolean = readBoolean()

  if ( isPassed ) {
    println(f"Student:$stdName | Age:$age | Percentage:$percentage | Status: Passed")
  }else{
    println(f"Student:$stdName | Age:$age | Percentage:$percentage | Status: Failed")
  }


}
