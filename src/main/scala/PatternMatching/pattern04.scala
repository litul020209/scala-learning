package PatternMatching

object pattern04 extends App{

  trait  expr
  case class Number(n:Int) extends expr
  case class Add(e1:expr , e2:expr) extends expr
  case class Prod(e1:expr , e2:expr) extends expr

  val a1 = new Number(10)
  val a2 = new Number(12)

  val s1 = new Add(a1, a2)
  val s2 = new Prod(a1, a2)

  def show(e:expr) :String = e match {
    case Number(n) => s"$n"
    case Prod(e1, e2) => show(e1) + " * " + show(e2)
    case Add(e1, e2) => show(e1) + " + " + show(e2)
  }

  println(show(Add(Number(1) , Number(2))))

}
