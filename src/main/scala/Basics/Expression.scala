package Basics

object Expression extends App{
  var x = 10

  x = x + 5

  println(x)

  val y = if (true) 10 else 20

  println(y)

  val k = {

    val a = 10
    val b = 20

    a + b
  }

  println(k)
}
