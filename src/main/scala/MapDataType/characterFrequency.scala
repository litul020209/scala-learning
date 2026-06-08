package MapDataType
import scala.collection.mutable.Map

object characterFrequency extends App{
  var s = "scala"
  var m = Map[Char,Int]()
  for (ch <- s){
    if (m.contains(ch) == true){
      m(ch) = m(ch) + 1
    }
    else{
      m += ( ch -> 1)
    }
  }
  println(m.toString)
  
}
