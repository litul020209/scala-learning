package Loops

object fiibonacciSeries extends App{
  var a = 0
  var b = 1
  var num = 10
  while (num != 0){
    println(a)
    var temp = a
    a = b
    b = b + temp
    num -= 1
  }

}
