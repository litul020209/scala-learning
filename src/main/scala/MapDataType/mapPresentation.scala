package MapDataType

object mapPresentation extends App{
  val map01 = Map[String , Int] ( ("Python",1) , ("C",2) , ("C++",3), ("Java" , 4))

  val map02 = Map[Int ,Int] ( 1 -> 100 , 2 -> 200 , 3 -> 300)

  val map03 = Map ("Str" -> "String" , 1  -> "C++" , ('C' , 2) , (1,2) -> 100 , List[Int](1,2,3) -> 100)
  println( map01.map( p => p._1.toLowerCase -> p._2) )

  val map04 = Map ( "Jim" -> 900 , "Jim" -> 555)

  println(map04("Jim"))

}
