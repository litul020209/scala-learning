package ArrayVectroList

object mergeList extends App{
  var lst1 = Array(1,2,3)
  var lst2 = Array(4,5,6)

  var nlst = lst1 ++ lst2
  println(nlst.mkString("[",",","]"))
}
