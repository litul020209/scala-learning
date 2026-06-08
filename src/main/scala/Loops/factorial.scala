package Loops

object factorial extends App{
  var fact = 1
  for (i <- 1 to 10){
    fact *= i
  }
  println(fact)
}
