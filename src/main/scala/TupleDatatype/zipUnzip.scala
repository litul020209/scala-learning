package TupleDatatype

object zipUnzip extends App{
  val arr = Array[Int](1,2,3,4)

  val lst = List[String]("one","two","three")

  val res = arr.zip(lst)

  println(res.mkString("[",",","]"))



}
