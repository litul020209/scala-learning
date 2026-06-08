package Oops.FourPillers

object Exercises1 extends App{
  val lst = new ListDT(List[Int](1,2,3,4,5))
  println(lst.headVal)
}
abstract  class MyList :
  def headVal:Int
  def tailVal:Int
  def ListIsEmpty:Boolean
  def addEle(e:Int) :List[Int]
  def stringConversion () : String

end MyList

class ListDT(var arr:List[Int]) extends MyList:

  override def headVal: Int = arr.head
  override  def tailVal:Int = arr.last
  override def ListIsEmpty: Boolean = arr.isEmpty

  override def addEle(e: Int): List[Int] = {
    var lst = arr :+ e
    lst
  }

  override def stringConversion(): String = arr.mkString("[",",","]")

end ListDT

