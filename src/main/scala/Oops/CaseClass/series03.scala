package Oops.CaseClass

object series03 extends App{
  case class Subject(name:String , age:Int)
  val allen = new Subject("Allen" , 26)

  println(allen.name)

  val allen2 = allen.hashCode()
  println(allen2)

  val allen3 = allen.copy(name = "allen3", age = 28)
  println(allen3)

  val jim1 = Subject
  println(jim1)

  val jim2 = Subject("Jim2",20)
  println(jim2)

}
