package TupleDatatype

object highestMarksStudent extends App{
  var lst = List(
    ("A",90),
    ("B",80),
    ("C",95)
  )
  var m = 0
  var n = ""

  for ( (k,v) <- lst){
      if( v > m){
         n = k
      }
  }
  println(n)
}
