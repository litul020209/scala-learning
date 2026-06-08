package ConditionalExpression
import scala.io.StdIn._
object practice02 extends   App{
      print("Enter the mark: ")
      val mark = readInt()
      val res = mark match{
        case x if x >= 90 => "A+"
        case x if x >= 80 => "A"
        case x if x >= 70 => "B+"
        case x if x >= 60 => "B"
        case x if x >= 50 => "C"
        case x if x >= 30 => "D"
        case _ => "Ex"
      }
      println(res)

}
