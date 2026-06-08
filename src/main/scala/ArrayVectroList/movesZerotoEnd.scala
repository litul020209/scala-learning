package ArrayVectroList

object movesZerotoEnd extends App{
  var arr:Array[Int] = Array(1,0,4,0,4,6,7,0,9)
  var narr : Array[Int] = Array()
  var zarr: Array[Int] = Array()

  for( i<- arr){
    if ( i == 0){
       zarr = zarr :+ i
    }
    else{
       narr = narr :+ i
    }
  }

  var ans = narr ++ zarr
  println(ans.mkString("[",",","]"))

}
