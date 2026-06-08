package Strings

object printSubString extends App{
  val s = "ABCD"

  for (i <- 0 until s.length ){
    for (j <- i until s.length){
       println(s.substring(i,j+1))
    }
  }

}
