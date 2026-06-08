package Loops

object forLoops extends  App{
   for( i <- 1 to 5 by 1){
     println(i)
   }
   for ( i <- 1 until 5 by 1){
     println(i)
   }

   for ( i <- 1 to 5 by 1){
     for (j <- 1 until i    ){
       print(j)
     }
     println()
   }

}
