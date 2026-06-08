package Recursions

object headRecursion extends App{

  def printNum(n: Int): Unit = {

    if (n > 0) {

      printNum(n - 1)

      println(n)

    }

  }
  printNum(5)

}
