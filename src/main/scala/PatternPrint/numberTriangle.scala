package PatternPrint
import scala.io.StdIn._
object numberTriangle extends App{
   print("Enter the r: ")
   val r = readInt()

   for ( i <- 1 to r+1 ){
      for ( j <- 1 to i){
          print(j.toString + " " )
      }
     println()
   }
  
}
