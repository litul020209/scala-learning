package OptionAndHandling

object optionEx01 extends App{

  val s  = Some("Hello")
  println(s)

  val noOption:Option[Int] = Some(100)

  def unSafe():String = null

  val result = unSafe()

  println(result)

  def backUp (): Option[Int]  = Some(100)



}
