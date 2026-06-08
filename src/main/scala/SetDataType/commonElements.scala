package SetDataType

object commonElements extends App{
  var s1 = Array(1,2,3,4)
  var s2 = Array(3,4,5,6)

  var res = s1.intersect(s2)

  println(res.mkString(" "))

}
