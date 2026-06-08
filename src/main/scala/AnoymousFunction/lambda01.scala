package AnoymousFunction

object lambda01 extends App{
  val lam01 :Int => Int = (x:Int ) => x*x

  println(lam01(10))

  val strToInt:String => Int = (x:String) => x.toInt

  println(strToInt("9"))

  val adder:(Int ,Int) => Int = _ + _

  println(adder(5,6))

  
  
}
