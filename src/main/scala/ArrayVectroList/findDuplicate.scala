package ArrayVectroList

object findDuplicate extends App{
  var lst = List(1,2,2,3,3,3,4)

  var arr = Array[Int]()

  for ( i <- lst){
    if ( lst.count( x => x == i) > 1 && !arr.contains(i)){
       arr = arr :+ i
    }
  }

  println(arr.mkString("[",",","]"))


}
