package ArrayVectroList

object ArrayMethods extends App {
  var arr = Array(1,2,3,4)
  println(arr.mkString)
  println(arr(0))

  //adding element into te array
  var newarr = arr :+ 5
  newarr = arr :+ 0
  println(newarr.mkString)

  println(arr.head)
  println(arr.tail.mkString         )
  println(arr.length)
  println(arr.sum)
  println(arr.max)
  println(arr.min)
  println(arr.contains(1))
  var rarr = arr.reverse.mkString(" ")
  println(rarr)

  var sarr = arr.sorted.mkString(" ")
  println(sarr)

  println(arr.indexOf(1))
  println(arr.take(2))
  println(arr.slice(1,3))

  arr.foreach(println)
  println(arr.count(x => x%2 ==0 ))

  println(arr.exists(x => x > 4))
  println(arr.forall(x => x>0))
  println(arr.drop(2))
                                                                   
}
