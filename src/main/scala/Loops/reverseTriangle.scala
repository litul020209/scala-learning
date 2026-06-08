package Loops

object reverseTriangle extends  App{
  for( i <- 1 to 5){
     for (j <- 5 to i by -1){
       print("*")
     }
     println()
  }
}
