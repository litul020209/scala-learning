package FunctionalProgrammingInScala

object scalaFunc02 extends App{
  val res1 = new Function2[String,String,String] {
    override def apply(v1: String, v2: String): String = v1+v2
  }
  println(res1("Hello" , "World"))
}
trait  JoinFunc [A,B] {
  def apply(e1:A,e2:B) : A
}
trait  JoinMethod [A,B] {
  def apply(e1:A,e2:B) : A
}