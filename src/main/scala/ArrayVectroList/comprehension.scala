package ArrayVectroList

object Comprehension  extends App{

    var x:Range = 1 to 10

    var arr = (for (i <- x if i % 2 != 0) yield i * i )

    println(arr.toArray.mkString("["," , ","]"))


}