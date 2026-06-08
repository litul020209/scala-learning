package Recursions

object printNumber extends App{
  def printNumbers(num:Int):Unit = {
    if (num == 1){
       println(1)
    }else{
      println(num)
      printNumbers(num - 1)
    }

  }
  printNumbers(10)
}
