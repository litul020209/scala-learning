package MapDataType
import scala.collection.mutable.Map
object wordCount extends App{
  var s = "hello scala hello"
  var new_s = s.split(" ")
  var m = Map[String,Int]()

  for ( i <- new_s){
    if (!m.contains(i)){
       m += ( i -> 1)
    }
    else{
      m(i) = m(i)+1
    }
  }
  println(m)

}
