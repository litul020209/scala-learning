package Loops

object Yield01 extends  App{
    val k = for (i <- 1 to 5 by 1) 
            yield i
    
    println(k)
}