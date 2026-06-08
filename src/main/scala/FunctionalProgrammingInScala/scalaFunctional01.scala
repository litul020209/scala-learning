package FunctionalProgrammingInScala

object scalaFunctional01 extends App{

//    val casting = new Func [Int,String] {
//      override def apply(ele: Int): String = ele.toString
//    }

    val intToString =new Function1[Int,String]{
      override def apply(ele: Int): String = ele.toString
    }
    println(intToString(100))
    println(intToString(100).getClass)
}

trait Func[A,B] {
  def apply(ele:A):B
}