package SetDataType
import scala.collection.mutable

object SetMethods extends App{
  var s = Set(1,2,3)
  println(s)

  val a = mutable.Set(4,5,6)
  a += 7
  println(a)

  val ns = s - 3
  println(ns)

  a -= 6
  println(a)
  
}
