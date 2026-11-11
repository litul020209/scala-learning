package PatternPrint

import scala.io.StdIn._

object ReverseNumberTriangle extends App{

    println("How many row you want: ")

    var row:Int = readInt()
    
    var temp =  row

    for(i <- 1 to row){

        for (j <- 1 to temp){

            print(j.toString + " ")
        }
        
        println()
        temp -= 1
    }
}