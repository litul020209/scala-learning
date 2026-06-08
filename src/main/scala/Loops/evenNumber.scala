package Loops

object evenNumber extends App{
  for (i <- 1 to 20 if i % 2 == 0){
      println(i)
  }
}
