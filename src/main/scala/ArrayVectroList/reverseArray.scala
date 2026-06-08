package ArrayVectroList

object reverseArray extends App{
  var arr = Array(1,2,3,4,5,6)

  var rarr = Array[Int]()

  for ( i <- arr.length-1 to 0 by -1){
    rarr = rarr :+ arr(i)

  }
  println(rarr.mkString("[",",","]"))
}
