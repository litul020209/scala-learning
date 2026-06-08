package Loops

object multipleof5ButNot10 extends App{
  for ( i <- 1 to 20 if i % 5 == 0 if i % 10 != 0){
     println(i)
  }

}
