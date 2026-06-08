package PatternPrint

object equlateralTriangle extends App{
  val r = 5

  for ( i <- 1 to r){
      for ( j <- r to i by -1){
          print("  ")
      }
      for (j <- 1 to i ) {
          print("* ")
      }
      for( j <- 1 to i-1 if i != 1){
          print("* ")
      }
      println()
  }

}
