package ArrayVectroList
import  scala.io.StdIn._
object leftAndrightRotate extends App{
  print("Enter K : ")
  var k = readInt()

  var arr = Array[Int](1,2,3,4,5)
  var narr =  arr.slice( k , arr.length) ++ arr.slice(0,k) 
  println(narr.mkString("[",",","]"))



}
