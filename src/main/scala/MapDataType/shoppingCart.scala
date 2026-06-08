package MapDataType

object shoppingCart extends App{

  val prices = Map(
    "Apple" -> 50.0,
    "Mango" -> 80.0,
    "Banana" -> 30.0,
    "Orange" -> 60.0,
    "Grapes" -> 120.0
  )
  val cart = List("Apple", "Mango", "Apple", "Banana", "Grapes", "Mango")

//  total bill
  var total:Int = 0
  var uniqueItems = List[String]()
  var expensive:Int = 0
  for ( c <- cart) {
      val n:Int = prices(c).toInt
      if ( n > expensive){
        expensive = n
      }
      total += n

      if (!uniqueItems.contains(c)) {
        uniqueItems = uniqueItems :+ c
    }
  }
  println(total)
  println(uniqueItems.mkString("[",",","]"))
  println(expensive)
  

}
