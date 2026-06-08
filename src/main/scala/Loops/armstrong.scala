package Loops
import scala.io.StdIn._

object armstrong extends App{
  print("Enter the num: ")
  var num = readInt()
  var temp = num
  var tempnum = num
  var len = 0
  while( temp != 0){
       len +=  1
       temp = temp / 10
       temp = temp.toInt
  }
  var sum = 0
  var tlen = len
  while( tlen != 0 ){
    var n = tempnum % 10
    n = math.pow(n,len).toInt
    sum += n
    tlen -= 1
    tempnum = tempnum / 10
    tempnum = tempnum.toInt

  }
  if (sum  == num){
    println("Armstrong")
  }
  else{
    println("Not Armstrong Number")
  }


}
