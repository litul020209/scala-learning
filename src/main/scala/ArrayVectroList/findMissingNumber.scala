package ArrayVectroList

object findMissingNumber extends App{
  var arr:Array[Int] = Array(3,7,9)
  var mx = arr.max
  println(mx)
  var narr : Array[Int] = Array()
  var r = 1 to mx
  for ( i <- r){
    if (!arr.contains(i)){
      narr = narr :+ i
    }
  }
  println(narr.mkString("[",",","]"))

}
